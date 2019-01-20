package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.repository.IPostRepository;

import com.network.manyathesocialnetwork.domain.entity.Post;


import javax.inject.Inject;
import javax.security.auth.callback.Callback;

public class PostInteractor {

    private IPostRepository postRepository;

    @Inject
    public PostInteractor(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void getPosts(DataCallback<Post> callback) {
        postRepository.getPosts(callback);
    }

}
