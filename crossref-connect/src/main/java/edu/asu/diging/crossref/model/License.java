package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.LicenseImpl;

@JsonDeserialize(as=LicenseImpl.class)
public interface License {

    Timestamp getStart();

    void setStart(Timestamp start);

    String getContentVersion();

    void setContentVersion(String contentVersion);

    Integer getDelayInDays();

    void setDelayInDays(Integer delayInDays);

    String getUrl();

    void setUrl(String url);

}