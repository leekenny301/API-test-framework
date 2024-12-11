package com.reqres.testcases;

import com.reqres.framework.BaseTest;
import com.reqres.utils.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static com.reqres.utils.Jobs.BANKER;
import static com.reqres.utils.Names.GEORGI;
import static com.reqres.utils.Requests.createRequestBody;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PostCreateUser extends BaseTest {
    @Test(groups = "regression")
    public void validatePostCreateUser(){
        String name = GEORGI.getName();
        String job = BANKER.getJob();

        JSONObject request = createRequestBody(name, job);

        Requests.postRequest(Endpoints.USERS.getEndpoints(), request.toJSONString())
                .then()
                .statusCode(201)
                .body(JsonKey.NAME.getJsonKey(), equalTo(name))
                .body(JsonKey.JOB.getJsonKey(), equalTo(job))
                .body(JsonKey.ID.getJsonKey(), notNullValue())
                .body(JsonKey.CREATED_AT.getJsonKey(), notNullValue())
                .log()
                .ifError();
    }
}
