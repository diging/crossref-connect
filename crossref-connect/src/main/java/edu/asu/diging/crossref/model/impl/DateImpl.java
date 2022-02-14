package edu.asu.diging.crossref.model.impl;

import java.util.List;

import edu.asu.diging.crossref.model.Date;

public class DateImpl implements Date {
    private List<Integer> indexedDateParts;

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Date#getIndexedDateParts()
     */
    public List<Integer> getIndexedDateParts() {
        return indexedDateParts;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Date#setIndexedDateParts(java.util.List)
     */
    public void setIndexedDateParts(List<Integer> indexedDateParts) {
        this.indexedDateParts = indexedDateParts;
    }
}
