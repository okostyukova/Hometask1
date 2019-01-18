package com.network.manyathesocialnetwork.domain.entity;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private int userId;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String userName;
    @SerializedName("email")
    private String email;

    public User(int userId, String name, String userName, String email) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return this.userId;
    }

    public void setUserId(int id) { this.userId = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
