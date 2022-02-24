package edu.asu.diging.crossref.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import edu.asu.diging.crossref.model.impl.MessageImpl;

@JsonDeserialize(as = MessageImpl.class)
public interface Message {

    int getTotalResults();

    void setTotalResults(int totalResults);

    List<Item> getItems();

    void setItems(List<Item> items);

    Integer getItemsPerPage();

    void setItemsPerPage(Integer itemsPerPage);

    Query getQuery();

    void setQuery(Query query);

    String getNextCursor();

    void setNextCursor(String nextCursor);

}