package com.network.manyathesocialnetwork.data.repository;

import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.domain.repository.IPostRepository;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.data.api.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostRepository implements IPostRepository {

    @Override
    public void getPosts(javax.security.auth.callback.Callback callback) {

    }

    @Override
    public void getComments(int id) {

    }

    @Override
    public void addPost() {

    }
}
