package com.network.manyathesocialnetwork.presentation.add_post;

import com.arellomobile.mvp.MvpView;

import com.network.manyathesocialnetwork.domain.entity.Post;

public interface AddPostView extends MvpView {
    void addPost(Post post);
    void addPostError(String message);
}
