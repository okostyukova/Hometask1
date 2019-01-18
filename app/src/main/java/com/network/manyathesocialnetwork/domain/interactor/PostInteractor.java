package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.repository.IPostRepository;

import com.network.manyathesocialnetwork.domain.entity.Comment;

import javax.inject.Inject;

public class PostInteractor {

    private IPostRepository postRepository;

    @Inject
    public PostInteractor(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    Comment getComments(int postId) {
        return postRepository.getComments(postId);
    }

    void addPost() {
        postRepository.addPost();
    }

}
