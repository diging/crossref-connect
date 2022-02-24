package edu.asu.diging.crossref.service.impl;

import java.io.IOException;
import java.util.List;

import edu.asu.diging.crossref.model.Item;

public interface CrossrefWorksService {

    List<Item> search(String query) throws IOException;

}