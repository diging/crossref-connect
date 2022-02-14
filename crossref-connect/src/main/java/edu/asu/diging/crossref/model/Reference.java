package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.ReferenceImpl;

@JsonDeserialize(as=ReferenceImpl.class)
public interface Reference {

    String getIssn();

    void setIssn(String issn);

    String getStandardsBody();

    void setStandardsBody(String standardsBody);

    String getIssue();

    void setIssue(String issue);

    String getKey();

    void setKey(String key);

    String getSeriesTitle();

    void setSeriesTitle(String seriesTitle);

    String getIsbnType();

    void setIsbnType(String isbnType);

    String getDoiAssertedBy();

    void setDoiAssertedBy(String doiAssertedBy);

    String getFirstPage();

    void setFirstPage(String firstPage);

    String getIsbn();

    void setIsbn(String isbn);

    String getDoi();

    void setDoi(String doi);

    String getComponent();

    void setComponent(String component);

    String getArticleTitle();

    void setArticleTitle(String articleTitle);

    String getVolumeTitle();

    void setVolumeTitle(String volumeTitle);

    String getVolume();

    void setVolume(String volume);

    String getAuthor();

    void setAuthor(String author);

    String getStandardDesignator();

    void setStandardDesignator(String standardDesignator);

    String getYear();

    void setYear(String year);

    String getUnstructured();

    void setUnstructured(String unstructured);

    String getEdition();

    void setEdition(String edition);

    String getJournalTitle();

    void setJournalTitle(String journalTitle);

    String getIssnType();

    void setIssnType(String issnType);

}