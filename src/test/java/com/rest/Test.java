package com.rest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test {
    @org.testng.annotations.Test
    public void test(){
        given().
                baseUri("https://api.postman.com").
                header("x-api-key","PMAK-65e339c5019ed6000182dc92-48669707f840a270dd3ae55f71ad77b0c9").
        when().
                get("/workspaces").
        then().
                log().all().
                assertThat().
                statusCode(200).
                body("workspaces.name",hasItems("My Workspace","SDET-QA Postman Practice","UdemyPractice","OmprakashChavan","TOBEDELETED"),
                        "workspaces.type",hasItems("personal", "personal", "team", "team", "team"),
                        "workspaces[0].name",is(equalTo("My Workspace")),
                           "workspaces.size()",equalTo(5),
                            "workspaces.name",hasItems("My Workspace"));

    }
}
