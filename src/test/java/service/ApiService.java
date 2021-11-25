package service;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.User;


import java.util.Arrays;
import java.util.List;


public class ApiService {

  private static final String USER_ENDPOINT = "/user";        // мінятись небуде і потрібна тільки в самому сервісі
    private static final String CREATE_USER_WITH_ARRAY_ENDPOINT = "/user/createWithArray";
    private static final String GET_USER_LOGOUT_ENDPOINT = "/user/logout";
    private static final String GET_USER_LOGIN_ENDPOINT = "/user/login";
    private static final String DELETE_USER_BY_USERNAME_ENDPOINT = "/user/username";
    private static final String PUT_USER_BY_USERNAME_ENDPOINT = "/user/username";
    private static final String GET_USER_BY_USERNAME_ENDPOINT = "/user/username";
    private static final String CREATE_USER_WITH_LIST_ENDPOINT = "/user/createWithList";
    private static final int OK_STATUS_CODE = 200;


    private final RequestSpecification specification;        // зберігаємо url сервісу

    public ApiService(String applicationUrl) {
        specification = RestAssured.given().baseUri(applicationUrl);
    }


    public User addUser(User user) {
        return RestAssured.given(specification)
                .body(user)
                .contentType(ContentType.JSON)
                .post(USER_ENDPOINT)
                .getBody()
                .as(User.class);

    }


    public List<User> createListOfUsers(User users) {
        final User[] response = RestAssured.given(specification)
                .body(users)
                .contentType(ContentType.JSON)
                .post(CREATE_USER_WITH_ARRAY_ENDPOINT)
                .getBody()
                .as(User[].class);
        return Arrays.asList(response);
    }


    public User logoutUsers() {
        return RestAssured.given(specification)
                .get(GET_USER_LOGOUT_ENDPOINT)
                .getBody()
                .as(User.class);
    }

    public User loginUser(String username, String password) {
        return RestAssured.given(specification)
                .param("username", username, "password", password)
                .get(GET_USER_LOGIN_ENDPOINT)
                .getBody()
                .as(User.class);

    }

    public User deleteUser(String username) {
       return RestAssured.given(specification)
                .param("username", username)
                .delete(DELETE_USER_BY_USERNAME_ENDPOINT)
                .getBody()
                .as(User.class);

    }


    public User updateUser(String username) {
        return RestAssured.given(specification)
                .param("username", username)
                .put(PUT_USER_BY_USERNAME_ENDPOINT)
                .getBody()
                .as(User.class);

    }


    public User getUsersByUsername(String username) {
        return RestAssured.given(specification)
                .param("username", username)
                .contentType(ContentType.JSON)
                .get(GET_USER_BY_USERNAME_ENDPOINT)
                .getBody()
                .as(User.class);

    }


    public List<User> postListOfUsers(User users) {
        final User[] response = RestAssured.given(specification)
                .body(users)
                .post(CREATE_USER_WITH_LIST_ENDPOINT)
                .getBody()
                .as(User[].class);
        return Arrays.asList(response);

    }


}
