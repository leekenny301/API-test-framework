package com.reqres.utils;

public enum JsonKey {
    PAGE("page"),
    DATA("data"),
    NAME("name"),
    JOB("job"),
    ID("id"),
    CREATED_AT("createdAt"),
    UPDATED_AT("updatedAt")
    ;

    private final String jsonKey;

    JsonKey(String jsonKey) {
        this.jsonKey = jsonKey;
    }

    public String getJsonKey(){
        return jsonKey;
    }
}
