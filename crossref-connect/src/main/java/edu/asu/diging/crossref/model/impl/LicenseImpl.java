package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.License;
import edu.asu.diging.crossref.model.Timestamp;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LicenseImpl implements License {
    private Timestamp start;
    @JsonProperty("content-version")
    private String contentVersion;
    @JsonProperty("delay-in-days")
    private Integer delayInDays;
    @JsonProperty("URL")
    private String url;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#getStart()
     */
    public Timestamp getStart() {
        return start;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#setStart(edu.asu.diging.crossref.model.impl.TimestampImpl)
     */
    public void setStart(Timestamp start) {
        this.start = start;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#getContentVersion()
     */
    public String getContentVersion() {
        return contentVersion;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#setContentVersion(java.lang.String)
     */
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#getDelayInDays()
     */
    public Integer getDelayInDays() {
        return delayInDays;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#setDelayInDays(java.lang.Integer)
     */
    public void setDelayInDays(Integer delayInDays) {
        this.delayInDays = delayInDays;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#getUrl()
     */
    public String getUrl() {
        return url;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.License#setUrl(java.lang.String)
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
