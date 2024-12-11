package com.reqres.utils;

public enum Jobs {
    BANKER("Banker"),
    CLEANING_GUY("Cleaning guy")
    ;

    private final String job;

    Jobs(String job){
        this.job = job;
    }

    public String getJob(){
        return this.job;
    }
}
