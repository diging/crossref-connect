package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.RelationImpl;

@JsonDeserialize(as=RelationImpl.class)
public interface Relation {

    String getIdType();

    void setIdType(String idType);

    String getId();

    void setId(String id);

    String getAssertedBy();

    void setAssertedBy(String assertedBy);

}