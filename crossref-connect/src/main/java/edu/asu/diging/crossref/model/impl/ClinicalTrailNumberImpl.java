package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.ClinicalTrailNumber;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ClinicalTrailNumberImpl implements ClinicalTrailNumber {
    @JsonProperty("clinical-trial-number")
    private String clinicalTrialNumber;
    private String registry;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ClinicalTrailNumber#getClinicalTrialNumber()
     */
    public String getClinicalTrialNumber() {
        return clinicalTrialNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ClinicalTrailNumber#setClinicalTrialNumber(java.lang.String)
     */
    public void setClinicalTrialNumber(String clinicalTrialNumber) {
        this.clinicalTrialNumber = clinicalTrialNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ClinicalTrailNumber#getRegistry()
     */
    public String getRegistry() {
        return registry;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ClinicalTrailNumber#setRegistry(java.lang.String)
     */
    public void setRegistry(String registry) {
        this.registry = registry;
    }
    
}
