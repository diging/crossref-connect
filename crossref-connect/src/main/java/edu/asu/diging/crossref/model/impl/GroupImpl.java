package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.asu.diging.crossref.model.Group;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupImpl implements Group {

    private String label;
    private String name;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Group#getLabel()
     */
    public String getLabel() {
        return label;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Group#setLabel(java.lang.String)
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Group#getName()
     */
    public String getName() {
        return name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Group#setName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }
}
