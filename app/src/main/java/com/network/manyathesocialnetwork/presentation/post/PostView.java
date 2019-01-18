package com.network.manyathesocialnetwork.presentation.post;

import android.support.annotation.NonNull;

import com.arellomobile.mvp.MvpView;

public interface PostView extends MvpView {
    void setupUserId(int id);
    void setupTitle(String title);
    void setupBody(String body);
}
