package com.reqres.utils;

public enum Endpoints {
    USERS("/users");

    private final String endpoints;

    Endpoints(String endpoints) {
        this.endpoints = endpoints;
    }

    public String getEndpoints(){
        return endpoints;
    }

}
