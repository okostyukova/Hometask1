package com.network.manyathesocialnetwork.domain.repository;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

import javax.security.auth.callback.Callback;

public interface IPostRepository {
//    void requestPost(int postId);
//    void requestUser(int userId);
    void getPosts(Callback callback);
    void getComments(int id);
    void addPost();
}
