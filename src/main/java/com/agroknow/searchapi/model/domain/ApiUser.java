package com.agroknow.searchapi.model.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonSerialize
public class ApiUser implements Serializable {

    private String apiKey;

    private String username;

    private String registeredFor;

    private Long hourlyLimit;

    private Long hourlyCount;

    private Long lifetimeCount;

    private Long lastCall;

    private boolean status;

    private Map<String, ?> preFilters = new HashMap<>();

    private String password;

    private Map<String, String> information = new HashMap<>();

    public ApiUser() {
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegisteredFor() {
        return registeredFor;
    }

    public void setRegisteredFor(String registeredFor) {
        this.registeredFor = registeredFor;
    }

    public Long getHourlyLimit() {
        return hourlyLimit;
    }

    public void setHourlyLimit(Long hourlyLimit) {
        this.hourlyLimit = hourlyLimit;
    }

    public Long getHourlyCount() {
        return hourlyCount;
    }

    public void setHourlyCount(Long hourlyCount) {
        this.hourlyCount = hourlyCount;
    }

    public Long getLastCall() {
        return lastCall;
    }

    public void setLastCall(Long lastCall) {
        this.lastCall = lastCall;
    }

    public Long getLifetimeCount() {
        return lifetimeCount;
    }

    public void setLifetimeCount(Long lifetimeCount) {
        this.lifetimeCount = lifetimeCount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Map<String, ?> getPreFilters() {
        return preFilters;
    }

    public void setPreFilters(Map<String, ?> preFilters) {
        this.preFilters = preFilters;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getInformation() {
        return information;
    }

    public void setInformation(Map<String, String> information) {
        this.information = information;
    }
}
