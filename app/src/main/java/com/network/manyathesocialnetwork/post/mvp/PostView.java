package com.network.manyathesocialnetwork.post.mvp;

import android.support.annotation.NonNull;

import com.arellomobile.mvp.MvpView;

public interface PostView extends MvpView {
    void setupUserId(int id);
    void setupTitle(@NonNull String title);
    void setupBody(@NonNull String body);
}
