package com.network.manyathesocialnetwork.domain.repository;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;

public interface PostRepository {
    void getPosts(DataCallback<Post> callback);
    void getComments(int id, DataCallback<Comment> callback);
    void addPost(Post post, DataCallback<Post> callback);
}
