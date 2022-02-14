package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.ContentDomainImpl;

@JsonDeserialize(as=ContentDomainImpl.class)
public interface ContentDomain {

    List<String> getDomain();

    void setDomain(List<String> domain);

    Boolean getCrossmarkRestriction();

    void setCrossmarkRestriction(Boolean crossmarkRestriction);

}