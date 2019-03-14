package com.example.test.spring;


public class Service {

    protected String baseUrl;
    protected String apiKey;

    public Service(String url, String key){

        this.baseUrl = url;
        this.apiKey = key;
    }
}