package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {
    @JsonProperty("id")
    private List<Integer> id;
    @JsonProperty("username")
    private List<String> username;
    @JsonProperty("firstName")
    private List<String> firstName;
    @JsonProperty("lastName")
    private List<String> lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("userStatus")
    private Integer userStatus;

    public User() {
    }

    @JsonProperty("id")
    public List<Integer> getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(List<Integer> id) {
        this.id = id;
    }

    @JsonProperty("username")
    public List<String> getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(List<String> username) {
        this.username = username;
    }

    @JsonProperty("firstName")
    public List<String> getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(List<String> firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public List<String> getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(List<String> lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("userStatus")
    public Integer getUserStatus() {
        return userStatus;
    }

    @JsonProperty("userStatus")
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}


