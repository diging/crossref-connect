package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.asu.diging.crossref.model.StandardsBody;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StandardsBodyImpl implements StandardsBody {
    private String name;
    private List<String> acronym;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.StandardsBody#getName()
     */
    public String getName() {
        return name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.StandardsBody#setName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.StandardsBody#getAcronym()
     */
    public List<String> getAcronym() {
        return acronym;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.StandardsBody#setAcronym(java.util.List)
     */
    public void setAcronym(List<String> acronym) {
        this.acronym = acronym;
    }
    
}
