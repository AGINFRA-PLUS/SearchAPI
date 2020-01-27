package com.agroknow.searchapi.service;

import com.agroknow.searchapi.config.NlpProperties;
import com.agroknow.searchapi.model.response.NERAnnotation;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class AnnotationServiceImpl implements AnnotationService {

    @Value("${ner.endpoint}")
    private String annotationEndpoint;

    @Value("${nlp.engStopwords}")
    private List<String> engStopwords;

    @Value("${nlp.fdkProdsStopwords}")
    private List<String> fdkProdsStopwords;

    @Value("${nlp.punctuation}")
    private List<String> punctuation;

    @Override
    public BoolQueryBuilder annotate(String input, String method, String vocabulary, Boolean smart) throws Exception {

        /*
         * Logic here
         * */
        return null;
    }

    private String cleanseStopwords(String text) {
        AtomicReference<String> cleansedText = new AtomicReference<>(text);
        engStopwords.forEach(sw ->
                        cleansedText.set(cleansedText.get().replaceAll("\\b" + sw + "\\b", ""))
        );
        fdkProdsStopwords.forEach(sw ->
                        cleansedText.set(cleansedText.get().replaceAll("\\b" + sw + "\\b", ""))
        );
        punctuation.forEach(sw ->
                        cleansedText.set(cleansedText.get().replace(sw, ""))
        );
        return cleansedText.get().replace(",", "");
    }

    private String cleanseSpecific(String text, List<String> specific) {
        AtomicReference<String> cleansedText = new AtomicReference<>(text);
        specific.forEach(sw ->
                        cleansedText.set(cleansedText.get().replaceAll("\\b" + sw + "\\b", ""))
        );
        return cleansedText.get();
    }
}
