package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.InstitutionImpl;

@JsonDeserialize(as=InstitutionImpl.class)
public interface Institution {

    String getName();

    void setName(String name);

    void setAcronym(List<String> acronym);

    List<String> getAcronym();

    void setDepartment(List<String> department);

    List<String> getDepartment();

    void setPlace(List<String> place);

    List<String> getPlace();

}