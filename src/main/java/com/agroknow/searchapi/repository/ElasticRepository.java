package com.agroknow.searchapi.repository;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;

public interface ElasticRepository {

    SearchResponse search(SearchSourceBuilder builder, String entityType, Boolean detail, Double score, SearchSourceBuilder countSourceBuilder, Long total) throws IOException;

    Long getTotal(SearchSourceBuilder builder, String entityType, Boolean detail, Double score, SearchSourceBuilder countSourceBuilder) throws IOException;

    GetResponse getById(String type, String id) throws IOException;
}
