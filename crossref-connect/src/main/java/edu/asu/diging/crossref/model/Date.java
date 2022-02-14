package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.DateImpl;

@JsonDeserialize(as=DateImpl.class)
public interface Date {

    List<Integer> getIndexedDateParts();

    void setIndexedDateParts(List<Integer> indexedDateParts);

}