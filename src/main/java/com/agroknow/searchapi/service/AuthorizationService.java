package com.agroknow.searchapi.service;

import com.agroknow.searchapi.model.domain.ApiUser;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.springframework.stereotype.Service;

public interface AuthorizationService {

    default ApiUser authorize(String apikey) throws Exception {
        return null;
    }

    default BoolQueryBuilder appendFilters(ApiUser user) throws Exception {
        return null;
    }

}
