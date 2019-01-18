package com.network.manyathesocialnetwork.data.repository;

import com.network.manyathesocialnetwork.domain.repository.IPostRepository;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.data.storage.Provider;

public class PostRepository implements IPostRepository {

    Provider.IPostStorage provider;

//    @Override
//    public void requestUser(int userId) {
//
//    }
//
//    @Override
//    public void requestPost(int postId) {
//
//    }

    @Override
    public Comment getComments(int id) {
        provider.g
    }

    @Override
    public void addPost() {

    }
}
