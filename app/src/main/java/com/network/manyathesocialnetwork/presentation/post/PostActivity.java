package com.network.manyathesocialnetwork.presentation.post;

import android.support.annotation.NonNull;

import com.arellomobile.mvp.MvpAppCompatActivity;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.presentation.post.PostView;
import com.network.manyathesocialnetwork.presentation.post.PostPresenter;

import java.util.List;

public class PostActivity extends MvpAppCompatActivity implements PostView {

    @InjectPresenter
    PostPresenter presenter;

    PostAdapter postAdapter;

    @Override
    public void showComments(List<Comment> comments) {
        postAdapter.setComments(comments);
    }
}
