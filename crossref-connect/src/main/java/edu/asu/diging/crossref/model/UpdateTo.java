package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.UpdateToImpl;

@JsonDeserialize(as=UpdateToImpl.class)
public interface UpdateTo {

    Timestamp getUpdated();

    void setUpdated(Timestamp updated);

    String getDoi();

    void setDoi(String doi);

    String getType();

    void setType(String type);

    String getLabel();

    void setLabel(String label);

}