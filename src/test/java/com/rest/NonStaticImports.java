package com.rest;

import io.restassured.RestAssured;

public class NonStaticImports {
    public void Simple_test_case(){
        RestAssured.given().
                baseUri("https://api.postman.com");
    }
}
