package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Query;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryImpl implements Query {

    @JsonProperty("start-index")
    private Integer startIndex;
    @JsonProperty("search-terms")
    private String searchTerms;
    
    @Override
    public Integer getStartIndex() {
        return startIndex;
    }
    @Override
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
    @Override
    public String getSearchTerms() {
        return searchTerms;
    }
    @Override
    public void setSearchTerms(String searchTerms) {
        this.searchTerms = searchTerms;
    }
}
