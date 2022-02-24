package edu.asu.diging.crossref.service;

import edu.asu.diging.crossref.service.impl.DefaultCrossrefConfiguration;

public interface CrossrefConfiguration {
    
    /**
     * Method to retrieve a default configuration for Crossref.
     * 
     * @return
     */
    static CrossrefConfiguration getDefaultConfig() {
        return new DefaultCrossrefConfiguration();
    }

    /**
     * This method returns the base path of the Crossref API, e.g.
     * <code>https://api.crossref.org</code>
     * @return
     */
    String getCrossrefApiBasePath();

    /**
     * This method returns the endpoint to retrieve works, e.g.
     * <code>/works</code>
     * @return
     */
    String getCrossrefWorksEndpoint();

    /**
     * Returns the query parameter name, e.g. <code>query</code>
     * @return
     */
    String getQueryParameter();

    void setQueryParameter(String queryParameter);

    void setCrossrefWorksEndpoint(String worksEndpoint);

    void setCrossrefApiBasePath(String apiBasePath);

    void setOffsetParameter(String offsetParameter);

    String getOffsetParameter();

    void setRowsParameter(String rowParameter);

    String getRowsParameter();
}