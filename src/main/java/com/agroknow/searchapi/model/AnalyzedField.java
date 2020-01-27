package com.agroknow.searchapi.model;

public class AnalyzedField {

    private String fieldName;

    private String analyzer;

    private float boost;

    public AnalyzedField() {
    }

    public AnalyzedField(String fieldName, String analyzer, float boost) {
        this.fieldName = fieldName;
        this.analyzer = analyzer;
        this.boost = boost;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
    }

    public float getBoost() {
        return boost;
    }

    public void setBoost(float boost) {
        this.boost = boost;
    }
}
