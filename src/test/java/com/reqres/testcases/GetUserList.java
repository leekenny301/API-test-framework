package com.reqres.testcases;

import com.reqres.framework.BaseTest;
import com.reqres.utils.Endpoints;
import com.reqres.utils.JsonKey;
import com.reqres.utils.Requests;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserList extends BaseTest {
    @Test(groups = "smoke")
    public void validateGetUsersList(){
        String page = "?page=2";

        Requests.getRequest(Endpoints.USERS.getEndpoints() + page)
                .then()
                .statusCode(200)
                .body(JsonKey.PAGE.getJsonKey(), equalTo(2))
                .body(JsonKey.DATA.getJsonKey(), notNullValue())
                .body("data.size()", equalTo(6))
        ;
    }
}
