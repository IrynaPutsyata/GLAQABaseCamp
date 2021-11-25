package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import groovy.lang.Range;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class User {

    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer phone;
    private Integer userStatus;

    public static User getDefaultUser(){
        User user = new User();
        user.setId(new Random().nextInt());
        user.setUsername("awr");
        user.setFirstName("ser");
        user.setLastName("sfsda");
        user.setEmail("asd@somemailservice.com");
        user.setPassword("5f685g68");
        user.setPhone(new Random().nextInt());
        user.setUserStatus(0);
        return user;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }


}


