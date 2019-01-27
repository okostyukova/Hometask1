package com.network.manyathesocialnetwork.presentation.main;

import com.arellomobile.mvp.MvpView;

public interface MainActivityView extends MvpView {
    void addPost();
    void showPosts();
    void showComments();
    void showError(String msg);
}
