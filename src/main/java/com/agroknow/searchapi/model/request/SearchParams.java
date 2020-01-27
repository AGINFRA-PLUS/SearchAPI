package com.agroknow.searchapi.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SearchParams {

    @NotBlank
    @JsonProperty(value = "apikey")
    private String apiKey;

    /*
    * Rest of search params here
    *
    * */

    public SearchParams() {
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
