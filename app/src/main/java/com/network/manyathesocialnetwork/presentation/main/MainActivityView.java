package com.network.manyathesocialnetwork.presentation.main;

import com.arellomobile.mvp.MvpView;

import java.util.List;

import com.network.manyathesocialnetwork.domain.entity.Post;

public interface MainActivityView extends MvpView {
    void addPost();
    void showPosts(List<Post> posts);
    void showComments();
    void showError(String msg);
}
