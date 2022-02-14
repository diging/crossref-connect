package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.ExplanationImpl;

@JsonDeserialize(as=ExplanationImpl.class)
public interface Explanation {

    String getUrl();

    void setUrl(String url);

}