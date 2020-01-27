package com.agroknow.searchapi.service;

import com.agroknow.searchapi.model.domain.ApiUser;
import com.agroknow.searchapi.repository.ApiUserRepository;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    private final ApiUserRepository repository;

    @Value("${hourly-limit.default}")
    private Long defaultHourlyLimit;

    public AuthorizationServiceImpl(ApiUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public ApiUser authorize(String apikey) throws Exception {

        /*
         * Logic here
         * */
        return null;
    }

    @Override
    public BoolQueryBuilder appendFilters(ApiUser user) throws Exception {
        /*
         * Logic here
         * */
        return null;
    }

}
