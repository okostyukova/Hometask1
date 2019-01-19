package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.repository.IPostRepository;
import com.network.manyathesocialnetwork.domain.entity.Post;

import javax.inject.Inject;

public class AddPostInteractor {

    private IPostRepository postRepository;

    @Inject
    AddPostInteractor (IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(int userId, int id, String title, String body, DataCallback<Post> callback) {
        postRepository.addPost(userId, id, title, body, callback);
    }
}
