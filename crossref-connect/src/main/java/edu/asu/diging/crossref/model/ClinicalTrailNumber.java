package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.ClinicalTrailNumberImpl;

@JsonDeserialize(as=ClinicalTrailNumberImpl.class)
public interface ClinicalTrailNumber {

    String getClinicalTrialNumber();

    void setClinicalTrialNumber(String clinicalTrialNumber);

    String getRegistry();

    void setRegistry(String registry);

}