package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Explanation;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ExplanationImpl implements Explanation {

    @JsonProperty("URL")
    private String url;

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Explanation#getUrl()
     */
    public String getUrl() {
        return url;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Explanation#setUrl(java.lang.String)
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
