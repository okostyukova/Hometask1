package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.repository.IPostRepository;

import com.network.manyathesocialnetwork.domain.entity.Post;


import javax.inject.Inject;

public class PostInteractor {

    private IPostRepository postRepository;

    @Inject
    public PostInteractor(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void getPosts() {
        postRepository.getPosts();
    }

}
