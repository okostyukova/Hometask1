package com.network.manyathesocialnetwork.presentation.post;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.arellomobile.mvp.MvpAppCompatActivity;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.presentation.post.PostPresenter;

import java.util.ArrayList;
import java.util.List;

public class PostActivity extends MvpAppCompatActivity implements PostView {

    @InjectPresenter
    PostPresenter presenter;

    @ProvidePresenter
    PostPresenter providePostPresenter() {
        return presenter;
    }

    private PostAdapter postAdapter;

    RecyclerView recyclerView = findViewById(R.id.recycler_comment);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_item);

        init();
    }

    @Override
    public void showComments(List<Comment> comments) {
        postAdapter.setComments(comments);
    }

    public void init() {
        RecyclerView recyclerView = findViewById(R.id.feed_recycler);

        ArrayList<Comment> data = new ArrayList<>();

        postAdapter = new PostAdapter(data, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PostActivity.class);
                startActivityForResult(intent, 2);
            }
        });
        recyclerView.setAdapter(postAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        presenter.showComments();
    }
}
