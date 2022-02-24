package edu.asu.diging.crossref.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.crossref.model.Item;
import edu.asu.diging.crossref.model.Message;
import edu.asu.diging.crossref.model.Query;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageImpl implements Message {

    @JsonProperty("total-results")
    private int totalResults;
    private List<Item> items;   
    @JsonProperty("items-per-page")
    private Integer itemsPerPage;
    private Query query;
    @JsonProperty("next-cursor")
    private String nextCursor;
    
    @Override
    public int getTotalResults() {
        return totalResults;
    }
    @Override
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    @Override
    public List<Item> getItems() {
        return items;
    }
    @Override
    public void setItems(List<Item> items) {
        this.items = items;
    }
    @Override
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }
    @Override
    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }
    @Override
    public Query getQuery() {
        return query;
    }
    @Override
    public void setQuery(Query query) {
        this.query = query;
    }
    @Override
    public String getNextCursor() {
        return nextCursor;
    }
    @Override
    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }
}
