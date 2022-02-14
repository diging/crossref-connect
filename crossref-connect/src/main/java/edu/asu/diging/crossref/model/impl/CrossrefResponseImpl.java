package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossrefResponseImpl {

    private String status;
    @JsonProperty("message-type")
    private String messageType;
    @JsonProperty("message-version")
    private String messageVersion;
    @JsonProperty("total-results")
    private int totalResults;
    private List<ItemImpl> items;
    
}
