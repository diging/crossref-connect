package edu.asu.diging.crossref.service;

import java.io.IOException;
import java.util.List;

import edu.asu.diging.crossref.model.Item;

public interface CrossrefWorksService {

    /**
     * This method send a search request to Crossref's works endpoint. It
     * uses the <code>query</code> parameter, which means all fields are queried.
     * @param query The query string.
     * @param pageSize Defines how many results should be returned.
     * @param offset Defines how many records should be skipped at the beginning (used for paginating through results).
     * @return
     * @throws IOException
     */
    List<Item> search(String query, int pageSize, int offset) throws IOException;

}