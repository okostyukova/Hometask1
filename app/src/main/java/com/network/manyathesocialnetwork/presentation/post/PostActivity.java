package com.network.manyathesocialnetwork.presentation.post;

import android.support.annotation.NonNull;

import com.arellomobile.mvp.MvpAppCompatActivity;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.network.manyathesocialnetwork.presentation.post.PostView;
import com.network.manyathesocialnetwork.presentation.post.PostPresenter;

public class PostActivity extends MvpAppCompatActivity implements PostView {

    @InjectPresenter
    PostPresenter presenter;

    @Override
    public void setupUserId(int id) {

    }
    @Override
    public void setupTitle(@NonNull String title) {

    }
    @Override
    public void setupBody(@NonNull String body) {

    }
}
