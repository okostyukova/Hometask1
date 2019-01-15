package com.network.manyathesocialnetwork.addPost.ui;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.network.manyathesocialnetwork.addPost.mvp.AddPostView;

import com.network.manyathesocialnetwork.addPost.mvp.AddPostPresenter;

public class AddPostActivity extends MvpAppCompatActivity implements AddPostView {

    @InjectPresenter
    AddPostPresenter presenter;
}
