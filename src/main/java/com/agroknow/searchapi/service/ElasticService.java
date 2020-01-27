package com.agroknow.searchapi.service;

import com.agroknow.searchapi.model.request.SearchParams;
import com.agroknow.searchapi.repository.ElasticRepository;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

public interface ElasticService {

    SearchResponse search(BoolQueryBuilder query, Integer page, Integer pageSize, SearchParams params, Long total) throws IOException;

    Long getTotal(BoolQueryBuilder query, Integer page, Integer pageSize, SearchParams params) throws IOException;

    GetResponse getById(String type, String id) throws IOException;
}
