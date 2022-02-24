package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Timestamp;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TimestampImpl implements Timestamp {

    @JsonProperty("date-parts")
    private List<List<Integer>> dateParts;
    @JsonProperty("date-time")
    private String dateTime;
    private long timestamp; 


    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timestamp#getIndexedDateParts()
     */
    public List<List<Integer>> getIndexedDateParts() {
        return dateParts;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timestamp#setIndexedDateParts(java.util.List)
     */
    public void setIndexedDateParts(List<List<Integer>> dateParts) {
        this.dateParts = dateParts;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timestamp#getDateTime()
     */
    public String getDateTime() {
        return dateTime;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timestamp#setDateTime(java.lang.String)
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timestamp#getTimestamp()
     */
    public long getTimestamp() {
        return timestamp;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timestamp#setTimestamp(long)
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
