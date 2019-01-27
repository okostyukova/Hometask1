package com.network.manyathesocialnetwork.domain.interactor;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.repository.PostRepository;
import com.network.manyathesocialnetwork.domain.entity.Post;

public class AddPostInteractor {

    private PostRepository postRepository;

    AddPostInteractor (PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(int userId, int id, String title, String body, DataCallback<Post> callback) {
        postRepository.addPost(userId, id, title, body, callback);
    }
}
