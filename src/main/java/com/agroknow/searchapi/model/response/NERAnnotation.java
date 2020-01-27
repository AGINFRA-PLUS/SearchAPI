package com.agroknow.searchapi.model.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

@JsonSerialize
public class NERAnnotation {

    private String text;

    private String label;

    private String ontology;

    private Double confidence;

    private List<String> parents = new ArrayList<>();

    private List<String> children = new ArrayList<>();

    public NERAnnotation() {
    }

    public NERAnnotation(String text, String label, String ontology, Double confidence) {
        this.text = text;
        this.label = label;
        this.ontology = ontology;
        this.confidence = confidence;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getOntology() {
        return ontology;
    }

    public void setOntology(String ontology) {
        this.ontology = ontology;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }
}
