package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Assertion;
import edu.asu.diging.crossref.model.Explanation;
import edu.asu.diging.crossref.model.Group;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AssertionImpl implements Assertion {
    private Group group;
    private Explanation explanation;
    private String name;
    private String value;
    @JsonProperty("URL")
    private String url;
    private Integer order;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#getGroup()
     */
    public Group getGroup() {
        return group;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#setGroup(edu.asu.diging.crossref.model.Group)
     */
    public void setGroup(Group group) {
        this.group = group;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#getExplanation()
     */
    public Explanation getExplanation() {
        return explanation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#setExplanation(edu.asu.diging.crossref.model.Explanation)
     */
    public void setExplanation(Explanation explanation) {
        this.explanation = explanation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#getName()
     */
    public String getName() {
        return name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#setName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#getValue()
     */
    public String getValue() {
        return value;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#setValue(java.lang.String)
     */
    public void setValue(String value) {
        this.value = value;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#getUrl()
     */
    public String getUrl() {
        return url;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#setUrl(java.lang.String)
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#getOrder()
     */
    public Integer getOrder() {
        return order;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Assertion#setOrder(java.lang.Integer)
     */
    public void setOrder(Integer order) {
        this.order = order;
    }
    
}
