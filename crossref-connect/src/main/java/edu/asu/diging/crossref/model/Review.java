package edu.asu.diging.crossref.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.ReviewImpl;

@JsonDeserialize(as=ReviewImpl.class)
public interface Review {

    String getType();

    void setType(String type);

    String getRunningNumber();

    void setRunningNumber(String runningNumber);

    String getRevisionRound();

    void setRevisionRound(String revisionRound);

    String getStage();

    void setStage(String stage);

    String getCompetingInterestStatement();

    void setCompetingInterestStatement(String competingInterestStatement);

    String getRecommendation();

    void setRecommendation(String recommendation);

    String getLanguage();

    void setLanguage(String language);

}