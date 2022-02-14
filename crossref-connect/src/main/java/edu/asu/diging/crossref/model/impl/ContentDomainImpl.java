package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.ContentDomain;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ContentDomainImpl implements ContentDomain {
    private List<String> domain;
    @JsonProperty("crossmark-restriction")
    private Boolean crossmarkRestriction;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ContentDomain#getDomain()
     */
    public List<String> getDomain() {
        return domain;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ContentDomain#setDomain(java.util.List)
     */
    public void setDomain(List<String> domain) {
        this.domain = domain;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ContentDomain#getCrossmarkRestriction()
     */
    public Boolean getCrossmarkRestriction() {
        return crossmarkRestriction;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.ContentDomain#setCrossmarkRestriction(java.lang.Boolean)
     */
    public void setCrossmarkRestriction(Boolean crossmarkRestriction) {
        this.crossmarkRestriction = crossmarkRestriction;
    }

}
