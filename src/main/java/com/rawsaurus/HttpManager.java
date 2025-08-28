package com.rawsaurus;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpManager {

    private HttpClient client;

    public HttpManager() {
        client = HttpClient.newHttpClient();
    }

    public URI toURI(String address){
        try{
            return new URI(address);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String get(String uri){

        HttpRequest request = HttpRequest.newBuilder()
                .uri(toURI(uri))
                .build();

        String response = "";

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }
}
