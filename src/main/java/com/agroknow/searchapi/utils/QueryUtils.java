package com.agroknow.searchapi.utils;

import com.agroknow.searchapi.model.AnalyzedField;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class QueryUtils {

    private static Integer pageSize;
    //    @Value("${search.orDelimiter}")
    private static String orDelimiter;
    //    @Value("${search.andDelimiter}")
    private static String andDelimiter;
    //    @Value("${search.notDelimiter}")
    private static String notDelimiter;
    @Value("${search.pageSize}")
    private Integer pPageSize;

    /*
     *   @TODO:
     *       add also list of fields (non-analyzed) at some point
     * */
    public static BoolQueryBuilder applyGrammar(String value, List<AnalyzedField> analyzedFields) {

        /*
         * Logic here
         * */
        return null;
    }

    public static BoolQueryBuilder applyGrammar(String field, String value) {
        /*
         * Logic here
         * */
        return null;
    }

    @PostConstruct
    public void init() {
        pageSize = pPageSize;
    }

    public Integer getpPageSize() {
        return pPageSize;
    }

    public void setpPageSize(Integer pPageSize) {
        this.pPageSize = pPageSize;
    }

    @Value("${search.orDelimiter}")
    public void setOrDelimiter(String orDel) {
        orDelimiter = orDel;
    }

    @Value("${search.andDelimiter}")
    public void setAndDelimiter(String andDel) {
        andDelimiter = andDel;
    }

    @Value("${search.notDelimiter}")
    public void setNotDelimiter(String notDel) {
        notDelimiter = notDel;
    }
}
