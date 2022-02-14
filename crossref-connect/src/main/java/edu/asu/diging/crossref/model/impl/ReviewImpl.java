package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Review;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ReviewImpl implements Review {
    private String type;
    @JsonProperty("running-number")
    private String runningNumber;
    @JsonProperty("revision-round")
    private String revisionRound;
    private String stage;
    @JsonProperty("competing-interest-statement")
    private String competingInterestStatement;
    private String recommendation;
    private String language;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#getType()
     */
    public String getType() {
        return type;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#setType(java.lang.String)
     */
    public void setType(String type) {
        this.type = type;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#getRunningNumber()
     */
    public String getRunningNumber() {
        return runningNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#setRunningNumber(java.lang.String)
     */
    public void setRunningNumber(String runningNumber) {
        this.runningNumber = runningNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#getRevisionRound()
     */
    public String getRevisionRound() {
        return revisionRound;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#setRevisionRound(java.lang.String)
     */
    public void setRevisionRound(String revisionRound) {
        this.revisionRound = revisionRound;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#getStage()
     */
    public String getStage() {
        return stage;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#setStage(java.lang.String)
     */
    public void setStage(String stage) {
        this.stage = stage;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#getCompetingInterestStatement()
     */
    public String getCompetingInterestStatement() {
        return competingInterestStatement;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#setCompetingInterestStatement(java.lang.String)
     */
    public void setCompetingInterestStatement(String competingInterestStatement) {
        this.competingInterestStatement = competingInterestStatement;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#getRecommendation()
     */
    public String getRecommendation() {
        return recommendation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#setRecommendation(java.lang.String)
     */
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Review#setLanguage(java.lang.String)
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
}
