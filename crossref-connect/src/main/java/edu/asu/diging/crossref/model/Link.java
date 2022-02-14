package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.LinkImpl;

@JsonDeserialize(as=LinkImpl.class)
public interface Link {

    String getUrl();

    void setUrl(String url);

    String getContentType();

    void setContentType(String contentType);

    String getContentVersion();

    void setContentVersion(String contentVersion);

    String getIntendedApplication();

    void setIntendedApplication(String intendedApplication);

}