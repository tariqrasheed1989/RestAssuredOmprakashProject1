package com.rest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Test {
    @org.testng.annotations.Test
    public void test(){
        String name=given().
                baseUri("https://api.postman.com").
                header("x-api-key","PMAK-65e339c5019ed6000182dc92-48669707f840a270dd3ae55f71ad77b0c9").
        when().
                get("/workspaces").
        then().
                log().all().
                assertThat().
                statusCode(200).
                extract().
                response().path("workspaces[0].name");
                System.out.println("workspace name = "+ name);

                assertThat(name,equalTo("My Workspace"));
//        JsonPath jsonPath=new JsonPath(res.asString());
//        System.out.println("workspace name = "+jsonPath.getString("workspaces[0].name"));
//        System.out.println("workspace name = "+res.path("workspaces[0].name"));

    }
}
