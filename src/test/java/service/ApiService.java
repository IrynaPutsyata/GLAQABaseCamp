package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.ApiResponse;

public class ApiService {

    public static final String SERVICE_ENDPOINT = "application.endpoint";
    public static final int RESPONSE_CODE = 200;


    private final String SERVICE_URL;


    public ApiService(String applicationUrl) {
        SERVICE_URL = applicationUrl;
    }


    public ApiResponse getSomething() {
        final Response response = RestAssured.given().baseUri(SERVICE_URL).get(SERVICE_ENDPOINT);
        response.then().statusCode(RESPONSE_CODE);
        return response.as(ApiResponse.class);
    }
}
