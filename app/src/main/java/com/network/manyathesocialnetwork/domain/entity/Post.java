package com.network.manyathesocialnetwork.domain.entity;

import  com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Post implements Serializable {

    @SerializedName("userId")
    private int userId;
    @SerializedName("id")
    private  int id;
    @SerializedName("title")
    private  String title;
    @SerializedName("body")
    private  String body;

    public Post(int userId, String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) { this.userId = id; }

    public int getId() {
        return  id;
    }

    public void setId(int id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public String getBody() {
        return  body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}