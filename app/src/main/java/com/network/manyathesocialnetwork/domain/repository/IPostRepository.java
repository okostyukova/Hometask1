package com.network.manyathesocialnetwork.domain.repository;

import com.network.manyathesocialnetwork.domain.entity.Comment;

public interface IPostRepository {
//    void requestPost(int postId);
//    void requestUser(int userId);
    Comment getComments(int postId);
    void addPost();
}
