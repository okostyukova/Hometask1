package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.repository.PostRepository;

public class CommentInteractor {

    private PostRepository postRepository;
    DataCallback<Comment> callback;

    CommentInteractor(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void getComments(int id) {
        postRepository.getComments(id, callback);
    }
}
