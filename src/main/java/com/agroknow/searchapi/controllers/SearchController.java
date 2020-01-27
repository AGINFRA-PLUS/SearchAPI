package com.agroknow.searchapi.controllers;

import com.agroknow.searchapi.config.ElasticProperties;
import com.agroknow.searchapi.model.AnalyzedField;
import com.agroknow.searchapi.model.domain.ApiUser;
import com.agroknow.searchapi.model.request.SearchParams;
import com.agroknow.searchapi.service.AnnotationService;
import com.agroknow.searchapi.service.AuthorizationService;
import com.agroknow.searchapi.service.ElasticService;
import com.agroknow.searchapi.utils.QueryUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class SearchController {

    @Autowired
    private ElasticService service;

    @Autowired
    private AnnotationService annotationService;

    @Autowired
    private AuthorizationService authorizationService;

    @Autowired
    private ElasticProperties properties;

    @RequestMapping(method = RequestMethod.POST, path = "/search-api/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<String> searchPost(@RequestBody SearchParams params) throws Exception {
        return searchGet(params);
    }

    @ApiIgnore
    @RequestMapping(method = RequestMethod.POST, path = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<String> searchPostSecond(@RequestBody SearchParams params) throws Exception {
        return searchGet(params);
    }

    @ApiIgnore
    @RequestMapping(method = RequestMethod.GET, path = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<String> searchGet(SearchParams params) throws Exception {

        ApiUser user = authorizationService.authorize(params.getApiKey());

        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();

        boolQuery.must(authorizationService.appendFilters(user));
        /*
        * Handle params here
        * */
        int page = params.getPage() == null ? 0 : params.getPage();

        Long total = service.getTotal(boolQuery, page, params.getPageSize(), params);
        String searchResponse = service.search(boolQuery, page, params.getPageSize(), params, total).toString();
        searchResponse = searchResponse.replace("{\"total\":{\"value\":10000,\"relation\":\"gte\"}", "{\"total\":{\"value\":" + total + "}");
        return ResponseEntity.status(HttpStatus.OK).body(searchResponse);
    }


}
