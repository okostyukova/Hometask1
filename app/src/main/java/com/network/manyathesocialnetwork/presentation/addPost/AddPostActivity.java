package com.network.manyathesocialnetwork.presentation.addPost;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.presentation.addPost.AddPostView;

import com.network.manyathesocialnetwork.presentation.addPost.AddPostPresenter;

public class AddPostActivity extends MvpAppCompatActivity implements AddPostView {

    @InjectPresenter
    AddPostPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
    }

    @Override
    public void addPost(Post post) {
        presenter.addPost();
    }
}
