package com.network.manyathesocialnetwork.presentation.addPost;

import com.arellomobile.mvp.MvpView;

import com.network.manyathesocialnetwork.domain.entity.Post;

public interface AddPostView extends MvpView {
    void addPost(Post post);
}
