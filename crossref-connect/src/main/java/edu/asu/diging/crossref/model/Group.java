package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.GroupImpl;

@JsonDeserialize(as=GroupImpl.class)
public interface Group {

    String getLabel();

    void setLabel(String label);

    String getName();

    void setName(String name);

}