package com.network.manyathesocialnetwork.presentation.addPost;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.network.manyathesocialnetwork.presentation.addPost.AddPostView;

import com.network.manyathesocialnetwork.presentation.addPost.AddPostPresenter;

public class AddPostActivity extends MvpAppCompatActivity implements AddPostView {

    @InjectPresenter
    AddPostPresenter presenter;
}
