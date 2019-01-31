package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.repository.PostRepository;

import javax.inject.Inject;

public class CommentInteractor {

    private PostRepository postRepository;

    @Inject
    CommentInteractor(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void getComments(int id, DataCallback<Comment> callback) {
        postRepository.getComments(id, callback);
    }
}
