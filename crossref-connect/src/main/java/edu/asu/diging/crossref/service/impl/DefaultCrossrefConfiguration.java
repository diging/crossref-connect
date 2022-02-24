package edu.asu.diging.crossref.service.impl;

import edu.asu.diging.crossref.service.CrossrefConfiguration;

/** 
 * This is a default implementation of {@link CrossrefConfiguration}. It's configured with
 * the values for the Crossref API as of spring 2022.
 * @author jdamerow
 *
 */
public class DefaultCrossrefConfiguration implements CrossrefConfiguration {
    
    private String apiBasePath = "https://api.crossref.org";
    private String worksEndpoint = "/works";
    private String queryParameter = "query";
    private String rowsParameter = "rows";
    private String offsetParameter = "offset";

    @Override
    public String getCrossrefApiBasePath() {
        return apiBasePath;
    }
    @Override
    public void setCrossrefApiBasePath(String apiBasePath) {
        this.apiBasePath = apiBasePath;
    }

    @Override
    public String getCrossrefWorksEndpoint() {
       return worksEndpoint;
    }
    @Override
    public void setCrossrefWorksEndpoint(String worksEndpoint) {
        this.worksEndpoint = worksEndpoint;
    }

    @Override
    public String getQueryParameter() {
        return queryParameter;
    }
    @Override
    public void setQueryParameter(String queryParameter) {
        this.queryParameter = queryParameter;
    }
    @Override
    public String getRowsParameter() {
        return rowsParameter;
    }
    @Override
    public void setRowsParameter(String rowParameter) {
        this.rowsParameter = rowParameter;
    }
    @Override
    public String getOffsetParameter() {
        return offsetParameter;
    }
    @Override
    public void setOffsetParameter(String offsetParameter) {
        this.offsetParameter = offsetParameter;
    }
}
