package edu.asu.diging.crossref;

import java.io.IOException;
import java.util.List;

import edu.asu.diging.crossref.model.Item;
import edu.asu.diging.crossref.service.CrossrefConfiguration;
import edu.asu.diging.crossref.service.impl.CrossrefConfigurationImpl;
import edu.asu.diging.crossref.service.impl.CrossrefWorksService;
import edu.asu.diging.crossref.service.impl.CrossrefWorksServiceImpl;

public class Main {

    public static void main(String[] args) {
        CrossrefConfiguration config = new CrossrefConfigurationImpl("https://api.crossref.org", "/works");
        CrossrefWorksService service = new CrossrefWorksServiceImpl(config);
        
        try {
            List<Item> results = service.search("einstein");
            System.out.println(results);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
