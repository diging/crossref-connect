package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Relation;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RelationImpl implements Relation {
    @JsonProperty("id-type")
    private String idType;
    @JsonProperty("id")
    private String id;
    @JsonProperty("asserted-by")
    private String assertedBy;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reply#getIdType()
     */
    public String getIdType() {
        return idType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reply#setIdType(java.lang.String)
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reply#getId()
     */
    public String getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reply#setId(java.lang.String)
     */
    public void setId(String id) {
        this.id = id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reply#getAssertedBy()
     */
    public String getAssertedBy() {
        return assertedBy;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reply#setAssertedBy(java.lang.String)
     */
    public void setAssertedBy(String assertedBy) {
        this.assertedBy = assertedBy;
    }
}
