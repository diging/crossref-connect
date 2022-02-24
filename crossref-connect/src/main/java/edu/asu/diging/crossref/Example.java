package edu.asu.diging.crossref;

import java.io.IOException;
import java.util.List;

import edu.asu.diging.crossref.model.Item;
import edu.asu.diging.crossref.service.CrossrefConfiguration;
import edu.asu.diging.crossref.service.CrossrefWorksService;
import edu.asu.diging.crossref.service.impl.CrossrefWorksServiceImpl;

public class Example {

    public static void main(String[] args) {
        CrossrefWorksService service = new CrossrefWorksServiceImpl(CrossrefConfiguration.getDefaultConfig());
        
        try {
            List<Item> results = service.search("einstein", 5, 0);
            results.forEach(r -> System.out.println(r.getTitle()));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
