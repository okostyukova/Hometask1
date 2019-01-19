package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.repository.IPostRepository;

import javax.inject.Inject;

public class CommentInteractor {

    private IPostRepository postRepository;

    @Inject
    CommentInteractor(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void getComments(int id) {
        postRepository.getComments(id);
    }
}
