package edu.asu.diging.crossref.service.impl;

import edu.asu.diging.crossref.service.CrossrefConfiguration;

public class CrossrefConfigurationImpl implements CrossrefConfiguration {
    
    private String crossrefApiBasePath;
    private String crossrefWorksEndpoint;
    
    public CrossrefConfigurationImpl(String crossrefApiBasePath, String crossrefWorksEndpoint) {
        super();
        this.crossrefApiBasePath = crossrefApiBasePath;
        this.crossrefWorksEndpoint = crossrefWorksEndpoint;
    }
    
    public String getCrossrefApiBasePath() {
        return crossrefApiBasePath;
    }
    public void setCrossrefApiBasePath(String crossrefApiBasePath) {
        this.crossrefApiBasePath = crossrefApiBasePath;
    }
    public String getCrossrefWorksEndpoint() {
        return crossrefWorksEndpoint;
    }
    public void setCrossrefWorksEndpoint(String crossrefWorksEndpoint) {
        this.crossrefWorksEndpoint = crossrefWorksEndpoint;
    }
    
}
