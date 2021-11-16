package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.User;

import java.util.List;
import java.util.Map;

public class ApiService {

    public static final String CREATE_USER_ENDPOINT = "/user";    // мінятись небуде і потрібна тільки в самому сервісі
    public static final String CREATE_USER_WITH_ARRAY_ENDPOINT = "/user/createWithArray";
    public static final String GET_USER_LOGOUT_ENDPOINT = "/user/logout";
    public static final String GET_USER_LOGIN_ENDPOINT = "/user/login";
    public static final String DELETE_USER_BY_USERNAME_ENDPOINT = "/user/{username}";
    public static final String PUT_USER_BY_USERNAME_ENDPOINT = "/user/{username}";
    public static final String GET_USER_BY_USERNAME_ENDPOINT = "/user/{username}";
    public static final String CREATE_USER_WITH_LIST_ENDPOINT = "/user/createWithList";
    public static final int RESPONSE_CODE = 200;


    private final RequestSpecification specification;        // зберігаємо url сервісу


    public ApiService(String applicationUrl) {
        specification = RestAssured.given().baseUri(applicationUrl);
    }


    /* public ApiResponse getSomething() {
         final Response response = RestAssured.given().baseUri(SERVICE_URL).get(CREATE_USER_ENDPOINT);  // валідуємо код
         response.then().statusCode(RESPONSE_CODE);
         return response.as(ApiResponse.class);
     }
     */
    public User createUser(User newUser) {
        Response response = RestAssured.given(specification)
                .body(newUser)
                .post(CREATE_USER_ENDPOINT);
        return response.as(User.class);

    }

    public List<User> createListOfUsers(User newUsers) {
        Response response = RestAssured.given(specification)
                .body(newUsers)
                .post(CREATE_USER_WITH_ARRAY_ENDPOINT);
        return response.body().jsonPath().getList(" ");
    }

    public List<String> logoutUsers(User logoutUsers) {
        Response response = RestAssured.given(specification)
                .body(logoutUsers)
                .get(GET_USER_LOGOUT_ENDPOINT);
        return response.body().jsonPath().getList(" ");
    }

    public List<String> loginUsers(String username, String password) {
        Response response = RestAssured.given(specification)
                .param("username", username, "password", password)
                .get(GET_USER_LOGIN_ENDPOINT);
        return response.body().jsonPath().getList(" ");
    }

    public List<String> deleteUsers(String username) {
        Response response = RestAssured.given(specification)
                .param("username", username)
                .delete(DELETE_USER_BY_USERNAME_ENDPOINT);
        return response.body().jsonPath().getList(" ");
    }

    public List<String> updateUsers(User updateUsers, String username) {
        Response response = RestAssured.given(specification)
                .body(updateUsers)
                .param("username", username)
                .put(PUT_USER_BY_USERNAME_ENDPOINT);
        return response.body().jsonPath().getList(" ");

    }

    public List<String> getUsersByUsername(String username) {
        Response response = RestAssured.given(specification)
                .param("username", username)
                .get(GET_USER_BY_USERNAME_ENDPOINT);
        return response.body().jsonPath().getList(" ");
    }

    public List<User> postListOfUsers(User listOfUsers) {
        Response response = RestAssured.given(specification)
                .body(listOfUsers)
                .post(CREATE_USER_WITH_LIST_ENDPOINT);
        return response.body().jsonPath().getList(" ");


    }


}
