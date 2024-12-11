package com.reqres.framework;

import com.reqres.utils.Names;
import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
    @BeforeTest
    protected void setup(){
        RestAssured.baseURI = "https://reqres.in/api";
    }
}
