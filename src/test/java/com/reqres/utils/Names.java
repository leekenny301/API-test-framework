package com.reqres.utils;

public enum Names {
    GEORGI("Georgi"),
    ;

    private final String name;

    Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
