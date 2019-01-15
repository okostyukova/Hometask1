package com.network.manyathesocialnetwork.post.common;

import  com.google.gson.annotations.SerializedName;

public class PostItem {
    @SerializedName("userId")
    private int userId;
    @SerializedName("id")
    private  int id;
    @SerializedName("title")
    private  String title;
    @SerializedName("body")
    private  String body;

    public PostItem(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return  id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return  body;
    }
}