package com.network.manyathesocialnetwork.presentation.add_post;

import com.arellomobile.mvp.MvpView;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.entity.Post;

public interface AddPostView extends MvpView {
    void addPost(int userId, int id, String title, String body, DataCallback<Post> callback);
}
