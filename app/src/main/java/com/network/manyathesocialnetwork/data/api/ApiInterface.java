package com.network.manyathesocialnetwork.data.api;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/posts")
    Call<List<Post>> getPosts();

    @GET("/comments")
    Call<List<Comment>> getComments(@Query("postId") int postId);

    @POST("/posts")
    Call<Post> addPost(@Body Post post);
}
