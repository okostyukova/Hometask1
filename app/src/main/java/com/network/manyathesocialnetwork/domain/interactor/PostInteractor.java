package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.repository.PostRepository;

import com.network.manyathesocialnetwork.domain.entity.Post;


import javax.inject.Inject;

public class PostInteractor {

    private PostRepository postRepository;

    @Inject
    public PostInteractor(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void getPosts(DataCallback<Post> callback) {
        postRepository.getPosts(callback);
    }
}
