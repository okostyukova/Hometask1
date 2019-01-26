package com.network.manyathesocialnetwork.domain.repository;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

import javax.security.auth.callback.Callback;
import com.network.manyathesocialnetwork.domain.callback.DataCallback;

import java.util.List;

import dagger.Module;
import dagger.Provides;

public interface IPostRepository {
    void getPosts(DataCallback<Post> callback);
    void getComments(int id, DataCallback<Comment> callback);
    void addPost(int userId, int id, String title, String body, DataCallback<Post> callback);
}
