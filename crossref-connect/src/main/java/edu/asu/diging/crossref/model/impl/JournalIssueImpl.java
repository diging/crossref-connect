package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Date;
import edu.asu.diging.crossref.model.JournalIssue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JournalIssueImpl implements JournalIssue {

    private String issue;
    @JsonProperty("published-online")
    private Date publishedOnline;
    @JsonProperty("published-print")
    private Date publishedPrint;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.JournalIssue#getIssue()
     */
    public String getIssue() {
        return issue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.JournalIssue#setIssue(java.lang.String)
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.JournalIssue#getPublishedOnline()
     */
    public Date getPublishedOnline() {
        return publishedOnline;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.JournalIssue#setPublishedOnline(edu.asu.diging.crossref.model.Date)
     */
    public void setPublishedOnline(Date publishedOnline) {
        this.publishedOnline = publishedOnline;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.JournalIssue#getPublishedPrint()
     */
    public Date getPublishedPrint() {
        return publishedPrint;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.JournalIssue#setPublishedPrint(edu.asu.diging.crossref.model.Date)
     */
    public void setPublishedPrint(Date publishedPrint) {
        this.publishedPrint = publishedPrint;
    }
}
