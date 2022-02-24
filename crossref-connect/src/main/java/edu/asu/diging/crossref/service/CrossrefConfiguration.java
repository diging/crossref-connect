package edu.asu.diging.crossref.service;

public interface CrossrefConfiguration {

    String getCrossrefApiBasePath();

    void setCrossrefApiBasePath(String crossrefApiBasePath);

    String getCrossrefWorksEndpoint();

    void setCrossrefWorksEndpoint(String crossrefWorksEndpoint);

}