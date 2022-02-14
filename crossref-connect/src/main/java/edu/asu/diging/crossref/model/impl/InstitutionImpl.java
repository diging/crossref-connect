package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.asu.diging.crossref.model.Institution;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionImpl implements Institution {

    private String name;
    private List<String> place;
    private List<String> department;
    private List<String> acronym;

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Affililation#getName()
     */
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.crossref.model.impl.Affililation#setName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPlace() {
        return place;
    }

    public void setPlace(List<String> place) {
        this.place = place;
    }

    public List<String> getDepartment() {
        return department;
    }

    public void setDepartment(List<String> department) {
        this.department = department;
    }

    public List<String> getAcronym() {
        return acronym;
    }

    public void setAcronym(List<String> acronym) {
        this.acronym = acronym;
    }
}
