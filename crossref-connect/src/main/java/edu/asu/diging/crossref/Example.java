package edu.asu.diging.crossref;

import java.io.IOException;
import java.util.List;

import edu.asu.diging.crossref.exception.RequestFailedException;
import edu.asu.diging.crossref.model.Item;
import edu.asu.diging.crossref.service.CrossrefConfiguration;
import edu.asu.diging.crossref.service.CrossrefWorksService;
import edu.asu.diging.crossref.service.impl.CrossrefWorksServiceImpl;

public class Example {

    public static void main(String[] args) {
        CrossrefWorksService service = new CrossrefWorksServiceImpl(CrossrefConfiguration.getDefaultConfig());
        
        // search works
        try {
            List<Item> results = service.search("einstein", 5, 0);
            results.forEach(r -> System.out.println(r.getTitle()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RequestFailedException e) {
            e.printStackTrace();
        }
        
        // get item by doi
        try {
            Item item = service.get("10.2307/2504118");
            System.out.println(item.getTitle());
            System.out.println("by");
            item.getAuthor().forEach(a -> System.out.print(a.getGiven() + " " + a.getFamily()));
        } catch (RequestFailedException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
