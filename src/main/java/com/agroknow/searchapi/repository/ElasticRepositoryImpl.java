package com.agroknow.searchapi.repository;

import com.agroknow.searchapi.config.ElasticProperties;
import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.CountRequest;
import org.elasticsearch.client.core.CountResponse;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class ElasticRepositoryImpl implements ElasticRepository {

    @Autowired
    private ElasticProperties properties;

    @Override
    public SearchResponse search(SearchSourceBuilder builder, String entityType, Boolean detail, Double score, SearchSourceBuilder countSourceBuilder, Long totalCount) throws IOException {

        /*
         * Logic here
         * */
        return null;
    }

    @Override
    public Long getTotal(SearchSourceBuilder builder, String entityType, Boolean detail, Double score, SearchSourceBuilder countSourceBuilder) throws IOException {

        /*
        * Logic here
        * */
        return null;
    }

    @Override
    public GetResponse getById(String type, String id) throws IOException {
        /*
         * Logic here
         * */
        return null;
    }
}
