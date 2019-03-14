package com.example.test.spring;

public class Service {

    protected String baseUrl;
    protected String sapUser;
    protected String sapPassword;
    protected String sapClient;

    public Service(String url, String user, String password, String client){

        this.baseUrl = url;
        this.sapClient = client;
        this.sapPassword = password;
        this.sapUser = user;
    }
}