package edu.asu.diging.crossref.service.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.asu.diging.crossref.model.Item;
import edu.asu.diging.crossref.model.impl.CrossrefResponseImpl;
import edu.asu.diging.crossref.service.CrossrefConfiguration;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CrossrefWorksServiceImpl implements CrossrefWorksService {

    private CrossrefConfiguration config;

    public CrossrefWorksServiceImpl(CrossrefConfiguration config) {
        this.config = config;
    }

    @Override
    public List<Item> search(String query) throws IOException {
        
        Request request = new Request.Builder()
                .url(config.getCrossrefApiBasePath() + config.getCrossrefWorksEndpoint() + "?query=" + query).build();

        OkHttpClient client = new OkHttpClient();
        
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                ObjectMapper mapper = new ObjectMapper();
                CrossrefResponseImpl results = mapper.readValue(response.body().string(), CrossrefResponseImpl.class);
                return results.getMessage().getItems();
            }
        }
        
        
        return null;
    }

    public CrossrefConfiguration getConfig() {
        return config;
    }

    public void setConfig(CrossrefConfiguration config) {
        this.config = config;
    }
}
