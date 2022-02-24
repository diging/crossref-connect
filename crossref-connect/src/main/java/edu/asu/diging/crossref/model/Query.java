package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.QueryImpl;

@JsonDeserialize(as=QueryImpl.class)
public interface Query {

    Integer getStartIndex();

    void setStartIndex(Integer startIndex);

    String getSearchTerms();

    void setSearchTerms(String searchTerms);

}