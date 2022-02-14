package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Institution;
import edu.asu.diging.crossref.model.Person;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PersonImpl implements Person {

    @JsonProperty("ORCID")
    private String orcid;
    private String suffix;
    private String given;
    private String family;
    private String name;
    @JsonProperty("authenticated-orcid")
    private Boolean authenticatedOrcid;
    private String prefix;
    private String sequence;
    private List<Institution> affiliation;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getOrcid()
     */
    public String getOrcid() {
        return orcid;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setOrcid(java.lang.String)
     */
    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getSuffix()
     */
    public String getSuffix() {
        return suffix;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setSuffix(java.lang.String)
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getGiven()
     */
    public String getGiven() {
        return given;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setGiven(java.lang.String)
     */
    public void setGiven(String given) {
        this.given = given;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getFamily()
     */
    public String getFamily() {
        return family;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setFamily(java.lang.String)
     */
    public void setFamily(String family) {
        this.family = family;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getName()
     */
    public String getName() {
        return name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getAuthenticatedOrcid()
     */
    public Boolean getAuthenticatedOrcid() {
        return authenticatedOrcid;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setAuthenticatedOrcid(java.lang.Boolean)
     */
    public void setAuthenticatedOrcid(Boolean authenticatedOrcid) {
        this.authenticatedOrcid = authenticatedOrcid;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getPrefix()
     */
    public String getPrefix() {
        return prefix;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setPrefix(java.lang.String)
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getSequence()
     */
    public String getSequence() {
        return sequence;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setSequence(java.lang.String)
     */
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#getAffiliation()
     */
    public List<Institution> getAffiliation() {
        return affiliation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Person#setAffiliation(java.util.List)
     */
    public void setAffiliation(List<Institution> affiliation) {
        this.affiliation = affiliation;
    }
}
