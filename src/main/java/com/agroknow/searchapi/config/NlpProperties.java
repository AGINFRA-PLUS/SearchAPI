package com.agroknow.searchapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "nlp")
public class NlpProperties {

    @Value("${search.andDelimiter}")
    private String andDelimiter;

    @Value("${search.orDelimiter}")
    private String orDelimiter;

    @Value("${search.notDelimiter}")
    private String notDelimiter;

    private List<String> engStopwords = new ArrayList<>();

    private List<String> fdkProdsStopwords = new ArrayList<>();

    private List<String> punctuation = new ArrayList<>();

    public List<String> getEngStopwords() {
        return engStopwords;
    }

    public void setEngStopwords(List<String> engStopwords) {
        this.engStopwords = engStopwords;
    }

    public List<String> getFdkProdsStopwords() {
        return fdkProdsStopwords;
    }

    public void setFdkProdsStopwords(List<String> fdkProdsStopwords) {
        this.fdkProdsStopwords = fdkProdsStopwords;
    }

    public String getAndDelimiter() {
        return andDelimiter;
    }

    public void setAndDelimiter(String andDelimiter) {
        this.andDelimiter = andDelimiter;
    }

    public String getOrDelimiter() {
        return orDelimiter;
    }

    public void setOrDelimiter(String orDelimiter) {
        this.orDelimiter = orDelimiter;
    }

    public String getNotDelimiter() {
        return notDelimiter;
    }

    public void setNotDelimiter(String notDelimiter) {
        this.notDelimiter = notDelimiter;
    }

    public List<String> getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(List<String> punctuation) {
        this.punctuation = punctuation;
    }
}
