package edu.asu.diging.crossref.service.impl;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.asu.diging.crossref.exception.RequestFailedException;
import edu.asu.diging.crossref.model.Item;
import edu.asu.diging.crossref.model.impl.CrossrefItemResponseImpl;
import edu.asu.diging.crossref.model.impl.CrossrefResponseImpl;
import edu.asu.diging.crossref.service.CrossrefConfiguration;
import edu.asu.diging.crossref.service.CrossrefWorksService;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CrossrefWorksServiceImpl implements CrossrefWorksService {

    private CrossrefConfiguration config;

    public CrossrefWorksServiceImpl(CrossrefConfiguration config) {
        this.config = config;
    }

    @Override
    public List<Item> search(String query, int pageSize, int offset) throws RequestFailedException, IOException {
        String url = config.getCrossrefApiBasePath() + config.getCrossrefWorksEndpoint();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        urlBuilder.addQueryParameter(config.getQueryParameter(), query);
        urlBuilder.addQueryParameter(config.getRowsParameter(), pageSize + "");
        urlBuilder.addQueryParameter(config.getOffsetParameter(), offset + "");
        
        Request request = new Request.Builder().url(urlBuilder.build()).build();
                
        OkHttpClient client = new OkHttpClient();
        
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                ObjectMapper mapper = new ObjectMapper();
                CrossrefResponseImpl results = mapper.readValue(response.body().string(), CrossrefResponseImpl.class);
                return results.getMessage().getItems();
            } else {
                throw new RequestFailedException("Request failed with message: " + response.body().string());
            }
        }
    }
    
    @Override
    public Item get(String doi) throws RequestFailedException, IOException {
        String url = config.getCrossrefApiBasePath() + config.getCrossrefWorksEndpoint();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url + "/" + URLEncoder.encode(doi, StandardCharsets.UTF_8.toString())).newBuilder();
        Request request = new Request.Builder().url(urlBuilder.build()).build();
        
        OkHttpClient client = new OkHttpClient();
        
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                ObjectMapper mapper = new ObjectMapper();
                CrossrefItemResponseImpl results = mapper.readValue(response.body().string(), CrossrefItemResponseImpl.class);
                return results.getMessage();
            } else {
                throw new RequestFailedException("Request failed with message: " + response.body().string());
            }
        }
    }

    public CrossrefConfiguration getConfig() {
        return config;
    }

    public void setConfig(CrossrefConfiguration config) {
        this.config = config;
    }
}
