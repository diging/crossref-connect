package edu.asu.diging.crossref.model.impl;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Assertion;
import edu.asu.diging.crossref.model.ClinicalTrailNumber;
import edu.asu.diging.crossref.model.ContentDomain;
import edu.asu.diging.crossref.model.Date;
import edu.asu.diging.crossref.model.Funder;
import edu.asu.diging.crossref.model.Institution;
import edu.asu.diging.crossref.model.IssnType;
import edu.asu.diging.crossref.model.Item;
import edu.asu.diging.crossref.model.JournalIssue;
import edu.asu.diging.crossref.model.License;
import edu.asu.diging.crossref.model.Link;
import edu.asu.diging.crossref.model.Person;
import edu.asu.diging.crossref.model.Reference;
import edu.asu.diging.crossref.model.Relation;
import edu.asu.diging.crossref.model.Review;
import edu.asu.diging.crossref.model.StandardsBody;
import edu.asu.diging.crossref.model.Timespan;
import edu.asu.diging.crossref.model.Timestamp;
import edu.asu.diging.crossref.model.UpdateTo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemImpl implements Item {
    
    private Timestamp indexed;
    private Timestamp created;
    private Timestamp deposited;
    
    
    @JsonProperty("published-print")
    private Date publishedPrint;
    @JsonProperty("published-online")
    private Date publishedOnline;
    private Date issued;
    private Date published;
    @JsonProperty("published-other")
    private Date publishedOther;
    @JsonProperty("content-created")
    private Date contentCreated;
    private Date approved;
    private Date accepted;
    private Date posted;
    
    private Person chair;
    private List<Person> author;
    private List<Person> editor;
    private List<Person> translator;
    
    private List<String> title;
    private String prefix;
    private String volume;
    @JsonProperty("abstract")
    private String abstractText;
    @JsonProperty("DOI")
    private String doi;
    private String type;
    private String page;
    private String publisher;
    private String issue;
    @JsonProperty("short-container-title")
    private List<String> shortContainerTitle;
    @JsonProperty("container-title")
    private List<String> containerTitle;
    private String language;
    private List<Link> link;
    @JsonProperty("journal-issue")
    private JournalIssue journalIssue;
    @JsonProperty("URL")
    private String url;
    private String subtype;
    @JsonProperty("article-number")
    private String articleNumber;
    private List<String> subject;
    @JsonProperty("part-number")
    private String partNumber;
    @JsonProperty("ISBN")
    private String isbn;
    @JsonProperty("short-title")
    private List<String> shortTitle;
    private List<String> subtitle;
    @JsonProperty("original-title")
    private List<String> originalTitle;
    @JsonProperty("ISSN")
    private List<String> issn;
    @JsonProperty("issn-type")
    private List<IssnType> issnType;
    @JsonProperty("edition-number")
    private String editionNumber;
    @JsonProperty("publisher-location")
    private String publisherLocation;
    
    @JsonProperty("update-to")
    private UpdateTo updateTo;
    
    @JsonProperty("reference-count")
    private Integer referenceCount;
    private List<License> license;
    private List<Funder> funder;
    @JsonProperty("content-domain")
    private ContentDomain contentDomain;
    @JsonProperty("update-policy")
    private String updatePolicy;
    private String source;
    @JsonProperty("is-referenced-by-count")
    private Long isReferencedByCount;
    @JsonProperty("clinical-trial-number")
    private ClinicalTrailNumber clinicalTrailNumber;
    private String member;
    private Float score;
    @JsonProperty("references-count")
    private Integer referencesCount;
    private List<String> archive;
    private Map<String, List<Relation>> relation;
    private List<Assertion> assertion;
    @JsonProperty("alternative-id")
    private List<String> alternativeId;
    @JsonProperty("component-number")
    private String componentNumber;
    @JsonProperty("free-to-read")
    private Timespan freeToRead;
    private String degree;
    private Review review;
    private List<Reference> reference;
    @JsonProperty("group-title")
    private List<String> groupTitle;
    @JsonProperty("standards-body")
    private List<StandardsBody> standardsBody;
    private Institution institution;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getIndexed()
     */
    public Timestamp getIndexed() {
        return indexed;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setIndexed(edu.asu.diging.crossref.model.Timestamp)
     */
    public void setIndexed(Timestamp indexed) {
        this.indexed = indexed;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getCreated()
     */
    public Timestamp getCreated() {
        return created;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setCreated(edu.asu.diging.crossref.model.Timestamp)
     */
    public void setCreated(Timestamp created) {
        this.created = created;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getDeposited()
     */
    public Timestamp getDeposited() {
        return deposited;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setDeposited(edu.asu.diging.crossref.model.Timestamp)
     */
    public void setDeposited(Timestamp deposited) {
        this.deposited = deposited;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPublishedPrint()
     */
    public Date getPublishedPrint() {
        return publishedPrint;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPublishedPrint(edu.asu.diging.crossref.model.Date)
     */
    public void setPublishedPrint(Date publishedPrint) {
        this.publishedPrint = publishedPrint;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPublishedOnline()
     */
    public Date getPublishedOnline() {
        return publishedOnline;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPublishedOnline(edu.asu.diging.crossref.model.Date)
     */
    public void setPublishedOnline(Date publishedOnline) {
        this.publishedOnline = publishedOnline;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getIssued()
     */
    public Date getIssued() {
        return issued;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setIssued(edu.asu.diging.crossref.model.Date)
     */
    public void setIssued(Date issued) {
        this.issued = issued;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPublished()
     */
    public Date getPublished() {
        return published;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPublished(edu.asu.diging.crossref.model.Date)
     */
    public void setPublished(Date published) {
        this.published = published;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPublishedOther()
     */
    public Date getPublishedOther() {
        return publishedOther;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPublishedOther(edu.asu.diging.crossref.model.Date)
     */
    public void setPublishedOther(Date publishedOther) {
        this.publishedOther = publishedOther;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getContentCreated()
     */
    public Date getContentCreated() {
        return contentCreated;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setContentCreated(edu.asu.diging.crossref.model.Date)
     */
    public void setContentCreated(Date contentCreated) {
        this.contentCreated = contentCreated;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getApproved()
     */
    public Date getApproved() {
        return approved;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setApproved(edu.asu.diging.crossref.model.Date)
     */
    public void setApproved(Date approved) {
        this.approved = approved;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getAccepted()
     */
    public Date getAccepted() {
        return accepted;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setAccepted(edu.asu.diging.crossref.model.Date)
     */
    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPosted()
     */
    public Date getPosted() {
        return posted;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPosted(edu.asu.diging.crossref.model.Date)
     */
    public void setPosted(Date posted) {
        this.posted = posted;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getChair()
     */
    public Person getChair() {
        return chair;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setChair(edu.asu.diging.crossref.model.Person)
     */
    public void setChair(Person chair) {
        this.chair = chair;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getAuthor()
     */
    public List<Person> getAuthor() {
        return author;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setAuthor(java.util.List)
     */
    public void setAuthor(List<Person> author) {
        this.author = author;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getEditor()
     */
    public List<Person> getEditor() {
        return editor;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setEditor(java.util.List)
     */
    public void setEditor(List<Person> editor) {
        this.editor = editor;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getTranslator()
     */
    public List<Person> getTranslator() {
        return translator;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setTranslator(java.util.List)
     */
    public void setTranslator(List<Person> translator) {
        this.translator = translator;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getTitle()
     */
    public List<String> getTitle() {
        return title;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setTitle(java.util.List)
     */
    public void setTitle(List<String> title) {
        this.title = title;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPrefix()
     */
    public String getPrefix() {
        return prefix;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPrefix(java.lang.String)
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getVolume()
     */
    public String getVolume() {
        return volume;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setVolume(java.lang.String)
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getAbstractText()
     */
    public String getAbstractText() {
        return abstractText;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setAbstractText(java.lang.String)
     */
    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getDoi()
     */
    public String getDoi() {
        return doi;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setDoi(java.lang.String)
     */
    public void setDoi(String doi) {
        this.doi = doi;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getType()
     */
    public String getType() {
        return type;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setType(java.lang.String)
     */
    public void setType(String type) {
        this.type = type;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPage()
     */
    public String getPage() {
        return page;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPage(java.lang.String)
     */
    public void setPage(String page) {
        this.page = page;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPublisher()
     */
    public String getPublisher() {
        return publisher;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPublisher(java.lang.String)
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getIssue()
     */
    public String getIssue() {
        return issue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setIssue(java.lang.String)
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getShortContainerTitle()
     */
    public List<String> getShortContainerTitle() {
        return shortContainerTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setShortContainerTitle(java.util.List)
     */
    public void setShortContainerTitle(List<String> shortContainerTitle) {
        this.shortContainerTitle = shortContainerTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getContainerTitle()
     */
    public List<String> getContainerTitle() {
        return containerTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setContainerTitle(java.util.List)
     */
    public void setContainerTitle(List<String> containerTitle) {
        this.containerTitle = containerTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getLanguage()
     */
    public String getLanguage() {
        return language;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setLanguage(java.lang.String)
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getLink()
     */
    public List<Link> getLink() {
        return link;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setLink(java.util.List)
     */
    public void setLink(List<Link> link) {
        this.link = link;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getJournalIssue()
     */
    public JournalIssue getJournalIssue() {
        return journalIssue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setJournalIssue(edu.asu.diging.crossref.model.JournalIssue)
     */
    public void setJournalIssue(JournalIssue journalIssue) {
        this.journalIssue = journalIssue;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getUrl()
     */
    public String getUrl() {
        return url;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setUrl(java.lang.String)
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getSubtype()
     */
    public String getSubtype() {
        return subtype;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setSubtype(java.lang.String)
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getArticleNumber()
     */
    public String getArticleNumber() {
        return articleNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setArticleNumber(java.lang.String)
     */
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getSubject()
     */
    public List<String> getSubject() {
        return subject;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setSubject(java.util.List)
     */
    public void setSubject(List<String> subject) {
        this.subject = subject;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPartNumber()
     */
    public String getPartNumber() {
        return partNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPartNumber(java.lang.String)
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getIsbn()
     */
    public String getIsbn() {
        return isbn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setIsbn(java.lang.String)
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getShortTitle()
     */
    public List<String> getShortTitle() {
        return shortTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setShortTitle(java.util.List)
     */
    public void setShortTitle(List<String> shortTitle) {
        this.shortTitle = shortTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getSubtitle()
     */
    public List<String> getSubtitle() {
        return subtitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setSubtitle(java.util.List)
     */
    public void setSubtitle(List<String> subtitle) {
        this.subtitle = subtitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getOriginalTitle()
     */
    public List<String> getOriginalTitle() {
        return originalTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setOriginalTitle(java.util.List)
     */
    public void setOriginalTitle(List<String> originalTitle) {
        this.originalTitle = originalTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getIssn()
     */
    public List<String> getIssn() {
        return issn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setIssn(java.util.List)
     */
    public void setIssn(List<String> issn) {
        this.issn = issn;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getIssnType()
     */
    public List<IssnType> getIssnType() {
        return issnType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setIssnType(java.util.List)
     */
    public void setIssnType(List<IssnType> issnType) {
        this.issnType = issnType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getEditionNumber()
     */
    public String getEditionNumber() {
        return editionNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setEditionNumber(java.lang.String)
     */
    public void setEditionNumber(String editionNumber) {
        this.editionNumber = editionNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getPublisherLocation()
     */
    public String getPublisherLocation() {
        return publisherLocation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setPublisherLocation(java.lang.String)
     */
    public void setPublisherLocation(String publisherLocation) {
        this.publisherLocation = publisherLocation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getUpdateTo()
     */
    public UpdateTo getUpdateTo() {
        return updateTo;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setUpdateTo(edu.asu.diging.crossref.model.UpdateTo)
     */
    public void setUpdateTo(UpdateTo updateTo) {
        this.updateTo = updateTo;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getReferenceCount()
     */
    public Integer getReferenceCount() {
        return referenceCount;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setReferenceCount(java.lang.Integer)
     */
    public void setReferenceCount(Integer referenceCount) {
        this.referenceCount = referenceCount;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getLicense()
     */
    public List<License> getLicense() {
        return license;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setLicense(java.util.List)
     */
    public void setLicense(List<License> license) {
        this.license = license;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getFunder()
     */
    public List<Funder> getFunder() {
        return funder;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setFunder(java.util.List)
     */
    public void setFunder(List<Funder> funder) {
        this.funder = funder;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getContentDomain()
     */
    public ContentDomain getContentDomain() {
        return contentDomain;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setContentDomain(edu.asu.diging.crossref.model.ContentDomain)
     */
    public void setContentDomain(ContentDomain contentDomain) {
        this.contentDomain = contentDomain;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getUpdatePolicy()
     */
    public String getUpdatePolicy() {
        return updatePolicy;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setUpdatePolicy(java.lang.String)
     */
    public void setUpdatePolicy(String updatePolicy) {
        this.updatePolicy = updatePolicy;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getSource()
     */
    public String getSource() {
        return source;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setSource(java.lang.String)
     */
    public void setSource(String source) {
        this.source = source;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getIsReferencedByCount()
     */
    public Long getIsReferencedByCount() {
        return isReferencedByCount;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setIsReferencedByCount(java.lang.Long)
     */
    public void setIsReferencedByCount(Long isReferencedByCount) {
        this.isReferencedByCount = isReferencedByCount;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getClinicalTrailNumber()
     */
    public ClinicalTrailNumber getClinicalTrailNumber() {
        return clinicalTrailNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setClinicalTrailNumber(edu.asu.diging.crossref.model.ClinicalTrailNumber)
     */
    public void setClinicalTrailNumber(ClinicalTrailNumber clinicalTrailNumber) {
        this.clinicalTrailNumber = clinicalTrailNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getMember()
     */
    public String getMember() {
        return member;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setMember(java.lang.String)
     */
    public void setMember(String member) {
        this.member = member;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getScore()
     */
    public Float getScore() {
        return score;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setScore(java.lang.Float)
     */
    public void setScore(Float score) {
        this.score = score;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getReferencesCount()
     */
    public Integer getReferencesCount() {
        return referencesCount;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setReferencesCount(java.lang.Integer)
     */
    public void setReferencesCount(Integer referencesCount) {
        this.referencesCount = referencesCount;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getArchive()
     */
    public List<String> getArchive() {
        return archive;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setArchive(java.util.List)
     */
    public void setArchive(List<String> archive) {
        this.archive = archive;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getRelation()
     */
    public Map<String, List<Relation>> getRelation() {
        return relation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setRelation(java.util.Map)
     */
    public void setRelation(Map<String, List<Relation>> relation) {
        this.relation = relation;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getAssertion()
     */
    public List<Assertion> getAssertion() {
        return assertion;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setAssertion(java.util.List)
     */
    public void setAssertion(List<Assertion> assertion) {
        this.assertion = assertion;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getAlternativeId()
     */
    public List<String> getAlternativeId() {
        return alternativeId;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setAlternativeId(java.util.List)
     */
    public void setAlternativeId(List<String> alternativeId) {
        this.alternativeId = alternativeId;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getComponentNumber()
     */
    public String getComponentNumber() {
        return componentNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setComponentNumber(java.lang.String)
     */
    public void setComponentNumber(String componentNumber) {
        this.componentNumber = componentNumber;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getFreeToRead()
     */
    public Timespan getFreeToRead() {
        return freeToRead;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setFreeToRead(edu.asu.diging.crossref.model.Timespan)
     */
    public void setFreeToRead(Timespan freeToRead) {
        this.freeToRead = freeToRead;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getDegree()
     */
    public String getDegree() {
        return degree;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setDegree(java.lang.String)
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getReview()
     */
    public Review getReview() {
        return review;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setReview(edu.asu.diging.crossref.model.Review)
     */
    public void setReview(Review review) {
        this.review = review;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getReference()
     */
    public List<Reference> getReference() {
        return reference;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setReference(java.util.List)
     */
    public void setReference(List<Reference> reference) {
        this.reference = reference;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getGroupTitle()
     */
    public List<String> getGroupTitle() {
        return groupTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setGroupTitle(java.util.List)
     */
    public void setGroupTitle(List<String> groupTitle) {
        this.groupTitle = groupTitle;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getStandardsBody()
     */
    public List<StandardsBody> getStandardsBody() {
        return standardsBody;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setStandardsBody(java.util.List)
     */
    public void setStandardsBody(List<StandardsBody> standardsBody) {
        this.standardsBody = standardsBody;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#getInstitution()
     */
    public Institution getInstitution() {
        return institution;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Item#setInstitution(edu.asu.diging.crossref.model.Institution)
     */
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
    
    
}
