package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.FunderImpl;

@JsonDeserialize(as=FunderImpl.class)
public interface Funder {

    void setAward(List<String> award);

    List<String> getAward();

    void setDoiAssertedBy(String doiAssertedBy);

    String getDoiAssertedBy();

    void setName(String name);

    String getName();

    void setDoi(String doi);

    String getDoi();

}