package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.repository.IPostRepository;

import javax.inject.Inject;

public class AddPostInteractor {

    private IPostRepository postRepository;

    @Inject
    AddPostInteractor(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost() {
        postRepository.addPost();
    }
}
