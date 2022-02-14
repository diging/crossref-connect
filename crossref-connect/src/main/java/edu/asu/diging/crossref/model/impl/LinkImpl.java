package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Link;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LinkImpl implements Link {

    @JsonProperty("URL")
    private String url;
    @JsonProperty("content-type")
    private String contentType;
    @JsonProperty("content-version")
    private String contentVersion;
    @JsonProperty("intended-application")
    private String intendedApplication;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#getUrl()
     */
    public String getUrl() {
        return url;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#setUrl(java.lang.String)
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#getContentType()
     */
    public String getContentType() {
        return contentType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#setContentType(java.lang.String)
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#getContentVersion()
     */
    public String getContentVersion() {
        return contentVersion;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#setContentVersion(java.lang.String)
     */
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#getIntendedApplication()
     */
    public String getIntendedApplication() {
        return intendedApplication;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Link#setIntendedApplication(java.lang.String)
     */
    public void setIntendedApplication(String intendedApplication) {
        this.intendedApplication = intendedApplication;
    }
    
}
