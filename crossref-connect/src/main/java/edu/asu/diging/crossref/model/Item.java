package edu.asu.diging.crossref.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.ItemImpl;

@JsonDeserialize(as=ItemImpl.class)
public interface Item {

    Timestamp getIndexed();

    void setIndexed(Timestamp indexed);

    Timestamp getCreated();

    void setCreated(Timestamp created);

    Timestamp getDeposited();

    void setDeposited(Timestamp deposited);

    Date getPublishedPrint();

    void setPublishedPrint(Date publishedPrint);

    Date getPublishedOnline();

    void setPublishedOnline(Date publishedOnline);

    Date getIssued();

    void setIssued(Date issued);

    Date getPublished();

    void setPublished(Date published);

    Date getPublishedOther();

    void setPublishedOther(Date publishedOther);

    Date getContentCreated();

    void setContentCreated(Date contentCreated);

    Date getApproved();

    void setApproved(Date approved);

    Date getAccepted();

    void setAccepted(Date accepted);

    Date getPosted();

    void setPosted(Date posted);

    Person getChair();

    void setChair(Person chair);

    List<Person> getAuthor();

    void setAuthor(List<Person> author);

    List<Person> getEditor();

    void setEditor(List<Person> editor);

    List<Person> getTranslator();

    void setTranslator(List<Person> translator);

    List<String> getTitle();

    void setTitle(List<String> title);

    String getPrefix();

    void setPrefix(String prefix);

    String getVolume();

    void setVolume(String volume);

    String getAbstractText();

    void setAbstractText(String abstractText);

    String getDoi();

    void setDoi(String doi);

    String getType();

    void setType(String type);

    String getPage();

    void setPage(String page);

    String getPublisher();

    void setPublisher(String publisher);

    String getIssue();

    void setIssue(String issue);

    List<String> getShortContainerTitle();

    void setShortContainerTitle(List<String> shortContainerTitle);

    List<String> getContainerTitle();

    void setContainerTitle(List<String> containerTitle);

    String getLanguage();

    void setLanguage(String language);

    List<Link> getLink();

    void setLink(List<Link> link);

    JournalIssue getJournalIssue();

    void setJournalIssue(JournalIssue journalIssue);

    String getUrl();

    void setUrl(String url);

    String getSubtype();

    void setSubtype(String subtype);

    String getArticleNumber();

    void setArticleNumber(String articleNumber);

    List<String> getSubject();

    void setSubject(List<String> subject);

    String getPartNumber();

    void setPartNumber(String partNumber);

    String getIsbn();

    void setIsbn(String isbn);

    List<String> getShortTitle();

    void setShortTitle(List<String> shortTitle);

    List<String> getSubtitle();

    void setSubtitle(List<String> subtitle);

    List<String> getOriginalTitle();

    void setOriginalTitle(List<String> originalTitle);

    List<String> getIssn();

    void setIssn(List<String> issn);

    List<IssnType> getIssnType();

    void setIssnType(List<IssnType> issnType);

    String getEditionNumber();

    void setEditionNumber(String editionNumber);

    String getPublisherLocation();

    void setPublisherLocation(String publisherLocation);

    UpdateTo getUpdateTo();

    void setUpdateTo(UpdateTo updateTo);

    Integer getReferenceCount();

    void setReferenceCount(Integer referenceCount);

    List<License> getLicense();

    void setLicense(List<License> license);

    List<Funder> getFunder();

    void setFunder(List<Funder> funder);

    ContentDomain getContentDomain();

    void setContentDomain(ContentDomain contentDomain);

    String getUpdatePolicy();

    void setUpdatePolicy(String updatePolicy);

    String getSource();

    void setSource(String source);

    Long getIsReferencedByCount();

    void setIsReferencedByCount(Long isReferencedByCount);

    ClinicalTrailNumber getClinicalTrailNumber();

    void setClinicalTrailNumber(ClinicalTrailNumber clinicalTrailNumber);

    String getMember();

    void setMember(String member);

    Float getScore();

    void setScore(Float score);

    Integer getReferencesCount();

    void setReferencesCount(Integer referencesCount);

    List<String> getArchive();

    void setArchive(List<String> archive);

    Map<String, List<Relation>> getRelation();

    void setRelation(Map<String, List<Relation>> relation);

    List<Assertion> getAssertion();

    void setAssertion(List<Assertion> assertion);

    List<String> getAlternativeId();

    void setAlternativeId(List<String> alternativeId);

    String getComponentNumber();

    void setComponentNumber(String componentNumber);

    Timespan getFreeToRead();

    void setFreeToRead(Timespan freeToRead);

    String getDegree();

    void setDegree(String degree);

    Review getReview();

    void setReview(Review review);

    List<Reference> getReference();

    void setReference(List<Reference> reference);

    List<String> getGroupTitle();

    void setGroupTitle(List<String> groupTitle);

    List<StandardsBody> getStandardsBody();

    void setStandardsBody(List<StandardsBody> standardsBody);

    Institution getInstitution();

    void setInstitution(Institution institution);

}