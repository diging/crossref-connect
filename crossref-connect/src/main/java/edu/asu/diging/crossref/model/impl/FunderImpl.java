package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Funder;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FunderImpl implements Funder {
    @JsonProperty("DOI")
    private String doi;
    private String name;
    @JsonProperty("doi-asserted-by")
    private String doiAssertedBy;
    private List<String> award;
    
    public String getDoi() {
        return doi;
    }
    public void setDoi(String doi) {
        this.doi = doi;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDoiAssertedBy() {
        return doiAssertedBy;
    }
    public void setDoiAssertedBy(String doiAssertedBy) {
        this.doiAssertedBy = doiAssertedBy;
    }
    public List<String> getAward() {
        return award;
    }
    public void setAward(List<String> award) {
        this.award = award;
    }
}
