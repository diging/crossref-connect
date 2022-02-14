package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Timestamp;
import edu.asu.diging.crossref.model.UpdateTo;

public class UpdateToImpl implements UpdateTo {
    private Timestamp updated;
    @JsonProperty("DOI")
    private String doi;
    private String type;
    private String label;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#getUpdated()
     */
    public Timestamp getUpdated() {
        return updated;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#setUpdated(edu.asu.diging.crossref.model.Timestamp)
     */
    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#getDoi()
     */
    public String getDoi() {
        return doi;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#setDoi(java.lang.String)
     */
    public void setDoi(String doi) {
        this.doi = doi;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#getType()
     */
    public String getType() {
        return type;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#setType(java.lang.String)
     */
    public void setType(String type) {
        this.type = type;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#getLabel()
     */
    public String getLabel() {
        return label;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.UpdateTo#setLabel(java.lang.String)
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
}
