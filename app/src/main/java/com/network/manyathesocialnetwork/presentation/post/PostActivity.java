package com.network.manyathesocialnetwork.presentation.post;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.presentation.post.PostPresenter;

import java.util.List;

public class PostActivity extends MvpAppCompatActivity implements PostView {

    @InjectPresenter
    PostPresenter presenter;

    PostAdapter postAdapter;

    RecyclerView recyclerView = findViewById(R.id.recycler_comment);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_item);


    }

    @Override
    public void showComments(List<Comment> comments) {
        postAdapter.setComments(comments);
    }
}
