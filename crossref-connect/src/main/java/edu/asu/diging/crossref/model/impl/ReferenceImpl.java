package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Reference;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ReferenceImpl implements Reference {

    private String issn;
    @JsonProperty("standards-body")
    private String standardsBody;
    private String issue;
    private String key;
    @JsonProperty("series-title")
    private String seriesTitle;
    @JsonProperty("isbn-type")
    private String isbnType;
    @JsonProperty("doi-asserted-by")
    private String doiAssertedBy;
    @JsonProperty("first-page")
    private String firstPage;
    private String isbn;
    private String doi;
    private String component;
    @JsonProperty("article-title")
    private String articleTitle;
    @JsonProperty("volume-title")
    private String volumeTitle;
    private String volume;
    private String author;
    @JsonProperty("standard-designator")
    private String standardDesignator;
    private String year;
    private String unstructured;
    private String edition;
    @JsonProperty("journal-title")
    private String journalTitle;
    @JsonProperty("issn-type")
    private String issnType;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getIssn()
     */
    public String getIssn() {
        return issn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setIssn(java.lang.String)
     */
    public void setIssn(String issn) {
        this.issn = issn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getStandardsBody()
     */
    public String getStandardsBody() {
        return standardsBody;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setStandardsBody(java.lang.String)
     */
    public void setStandardsBody(String standardsBody) {
        this.standardsBody = standardsBody;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getIssue()
     */
    public String getIssue() {
        return issue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setIssue(java.lang.String)
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getKey()
     */
    public String getKey() {
        return key;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setKey(java.lang.String)
     */
    public void setKey(String key) {
        this.key = key;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getSeriesTitle()
     */
    public String getSeriesTitle() {
        return seriesTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setSeriesTitle(java.lang.String)
     */
    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getIsbnType()
     */
    public String getIsbnType() {
        return isbnType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setIsbnType(java.lang.String)
     */
    public void setIsbnType(String isbnType) {
        this.isbnType = isbnType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getDoiAssertedBy()
     */
    public String getDoiAssertedBy() {
        return doiAssertedBy;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setDoiAssertedBy(java.lang.String)
     */
    public void setDoiAssertedBy(String doiAssertedBy) {
        this.doiAssertedBy = doiAssertedBy;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getFirstPage()
     */
    public String getFirstPage() {
        return firstPage;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setFirstPage(java.lang.String)
     */
    public void setFirstPage(String firstPage) {
        this.firstPage = firstPage;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getIsbn()
     */
    public String getIsbn() {
        return isbn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setIsbn(java.lang.String)
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getDoi()
     */
    public String getDoi() {
        return doi;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setDoi(java.lang.String)
     */
    public void setDoi(String doi) {
        this.doi = doi;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getComponent()
     */
    public String getComponent() {
        return component;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setComponent(java.lang.String)
     */
    public void setComponent(String component) {
        this.component = component;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getArticleTitle()
     */
    public String getArticleTitle() {
        return articleTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setArticleTitle(java.lang.String)
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getVolumeTitle()
     */
    public String getVolumeTitle() {
        return volumeTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setVolumeTitle(java.lang.String)
     */
    public void setVolumeTitle(String volumeTitle) {
        this.volumeTitle = volumeTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getVolume()
     */
    public String getVolume() {
        return volume;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setVolume(java.lang.String)
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getAuthor()
     */
    public String getAuthor() {
        return author;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setAuthor(java.lang.String)
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getStandardDesignator()
     */
    public String getStandardDesignator() {
        return standardDesignator;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setStandardDesignator(java.lang.String)
     */
    public void setStandardDesignator(String standardDesignator) {
        this.standardDesignator = standardDesignator;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getYear()
     */
    public String getYear() {
        return year;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setYear(java.lang.String)
     */
    public void setYear(String year) {
        this.year = year;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getUnstructured()
     */
    public String getUnstructured() {
        return unstructured;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setUnstructured(java.lang.String)
     */
    public void setUnstructured(String unstructured) {
        this.unstructured = unstructured;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getEdition()
     */
    public String getEdition() {
        return edition;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setEdition(java.lang.String)
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getJournalTitle()
     */
    public String getJournalTitle() {
        return journalTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setJournalTitle(java.lang.String)
     */
    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#getIssnType()
     */
    public String getIssnType() {
        return issnType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Reference#setIssnType(java.lang.String)
     */
    public void setIssnType(String issnType) {
        this.issnType = issnType;
    }
    
}
