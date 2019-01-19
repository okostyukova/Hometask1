package com.network.manyathesocialnetwork.domain.repository;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

public interface IPostRepository {
//    void requestPost(int postId);
//    void requestUser(int userId);
    void getPosts();
    void getComments(int id);
    void addPost();
}
