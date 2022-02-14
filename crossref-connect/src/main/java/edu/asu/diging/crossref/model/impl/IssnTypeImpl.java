package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.asu.diging.crossref.model.IssnType;

@JsonIgnoreProperties(ignoreUnknown=true)
public class IssnTypeImpl implements IssnType {
    
    private String value;
    private String type;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.IssnType#getValue()
     */
    public String getValue() {
        return value;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.IssnType#setValue(java.lang.String)
     */
    public void setValue(String value) {
        this.value = value;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.IssnType#getType()
     */
    public String getType() {
        return type;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.IssnType#setType(java.lang.String)
     */
    public void setType(String type) {
        this.type = type;
    }
    
}
