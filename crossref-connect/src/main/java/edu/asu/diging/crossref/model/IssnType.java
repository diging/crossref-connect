package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.IssnTypeImpl;

@JsonDeserialize(as=IssnTypeImpl.class)
public interface IssnType {

    String getValue();

    void setValue(String value);

    String getType();

    void setType(String type);

}