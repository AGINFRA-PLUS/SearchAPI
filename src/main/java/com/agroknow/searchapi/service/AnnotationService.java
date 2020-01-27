package com.agroknow.searchapi.service;

import org.elasticsearch.index.query.BoolQueryBuilder;

public interface AnnotationService {

    BoolQueryBuilder annotate(String input, String method, String vocabulary, Boolean smart) throws Exception;

}
