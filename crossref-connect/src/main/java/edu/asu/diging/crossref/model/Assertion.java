package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.AssertionImpl;

@JsonDeserialize(as=AssertionImpl.class)
public interface Assertion {

    Group getGroup();

    void setGroup(Group group);

    Explanation getExplanation();

    void setExplanation(Explanation explanation);

    String getName();

    void setName(String name);

    String getValue();

    void setValue(String value);

    String getUrl();

    void setUrl(String url);

    Integer getOrder();

    void setOrder(Integer order);

}