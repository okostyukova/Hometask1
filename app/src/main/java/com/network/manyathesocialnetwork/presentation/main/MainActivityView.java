package com.network.manyathesocialnetwork.presentation.main;

import com.arellomobile.mvp.MvpView;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

public interface MainActivityView extends MvpView {
    void addPost();
    void showComments();
    void showError(String msg);
}
