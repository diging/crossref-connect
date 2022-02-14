package edu.asu.diging.crossref.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Date;
import edu.asu.diging.crossref.model.Timespan;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TimespanImpl implements Timespan {

    @JsonProperty("start-date")
    private Date startDate;
    @JsonProperty("end-date")
    private Date endDate;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timespan#getStartDate()
     */
    public Date getStartDate() {
        return startDate;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timespan#setStartDate(edu.asu.diging.crossref.model.Date)
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timespan#getEndDate()
     */
    public Date getEndDate() {
        return endDate;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Timespan#setEndDate(edu.asu.diging.crossref.model.Date)
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
