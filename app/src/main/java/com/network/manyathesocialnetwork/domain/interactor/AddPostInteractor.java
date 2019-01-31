package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.repository.PostRepository;
import com.network.manyathesocialnetwork.domain.entity.Post;

import javax.inject.Inject;

public class AddPostInteractor {

    private PostRepository postRepository;

    @Inject
    AddPostInteractor (PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(Post post, DataCallback<Post> callback) {
        postRepository.addPost(post, callback);
    }
}
