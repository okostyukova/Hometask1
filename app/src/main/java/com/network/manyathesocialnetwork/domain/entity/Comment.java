package com.network.manyathesocialnetwork.domain.entity;

import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("postId")
    int postId;
    @SerializedName("id")
    int id;
    @SerializedName("name")
    String name;
    @SerializedName("body")
    String body;

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostId() {
        return postId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
