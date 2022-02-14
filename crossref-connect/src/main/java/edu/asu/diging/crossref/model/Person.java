package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.PersonImpl;

@JsonDeserialize(as=PersonImpl.class)
public interface Person {

    String getOrcid();

    void setOrcid(String orcid);

    String getSuffix();

    void setSuffix(String suffix);

    String getGiven();

    void setGiven(String given);

    String getFamily();

    void setFamily(String family);

    String getName();

    void setName(String name);

    Boolean getAuthenticatedOrcid();

    void setAuthenticatedOrcid(Boolean authenticatedOrcid);

    String getPrefix();

    void setPrefix(String prefix);

    String getSequence();

    void setSequence(String sequence);

    List<Institution> getAffiliation();

    void setAffiliation(List<Institution> affiliation);

}