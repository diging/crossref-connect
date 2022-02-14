package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.StandardsBodyImpl;

@JsonDeserialize(as=StandardsBodyImpl.class)
public interface StandardsBody {

    String getName();

    void setName(String name);

    List<String> getAcronym();

    void setAcronym(List<String> acronym);

}