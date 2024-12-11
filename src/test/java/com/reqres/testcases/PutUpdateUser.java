package com.reqres.testcases;

import com.reqres.framework.BaseTest;
import com.reqres.utils.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static com.reqres.utils.Names.GEORGI;
import static com.reqres.utils.Jobs.CLEANING_GUY;
import static com.reqres.utils.Requests.createRequestBody;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PutUpdateUser extends BaseTest {
    @Test(groups = "regression")
    public void validatePutUpdateUser(){
        String userId = "/301";
        String name = GEORGI.getName();
        String job = CLEANING_GUY.getJob();

        JSONObject request = createRequestBody(name, job);

        Requests.putRequest(Endpoints.USERS.getEndpoints() + userId, request.toJSONString())
                .then()
                .statusCode(200)
                .body(JsonKey.NAME.getJsonKey(), equalTo(name))
                .body(JsonKey.JOB.getJsonKey(), equalTo(job))
                .body(JsonKey.UPDATED_AT.getJsonKey(), notNullValue())
                .log()
                .ifError();
    }
}
