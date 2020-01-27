package com.agroknow.searchapi.service;

import com.agroknow.searchapi.model.request.SearchParams;
import com.agroknow.searchapi.repository.ElasticRepository;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

@Service
public class ElasticServiceImpl implements ElasticService {

    @Autowired
    private ElasticRepository repository;

    @Value("${search.pageSize}")
    private Integer pageSize;

    @Override
    public SearchResponse search(BoolQueryBuilder query, Integer page, Integer pageSize, SearchParams params, Long total) throws IOException {

        /*
        * Insert Impl here
        * */
        return repository.search(null, null, null, null, null, null);
    }


    @Override
    public Long getTotal(BoolQueryBuilder query, Integer page, Integer pageSize, SearchParams params) throws IOException {

        /*
         * Insert Impl here
         * */
        return repository.getTotal(null, null, null, null, null);
    }

    @Override
    public GetResponse getById(String type, String id) throws IOException {
        return repository.getById(type, id);
    }
}
