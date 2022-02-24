package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.TimestampImpl;

@JsonDeserialize(as=TimestampImpl.class)
public interface Timestamp {

    List<List<Integer>> getIndexedDateParts();

    void setIndexedDateParts(List<List<Integer>> indexedDateParts);

    String getDateTime();

    void setDateTime(String dateTime);

    long getTimestamp();

    void setTimestamp(long timestamp);

}