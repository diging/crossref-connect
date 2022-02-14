package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.JournalIssueImpl;

@JsonDeserialize(as=JournalIssueImpl.class)
public interface JournalIssue {

    String getIssue();

    void setIssue(String issue);

    Date getPublishedOnline();

    void setPublishedOnline(Date publishedOnline);

    Date getPublishedPrint();

    void setPublishedPrint(Date publishedPrint);

}