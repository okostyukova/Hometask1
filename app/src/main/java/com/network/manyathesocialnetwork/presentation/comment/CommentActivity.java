package com.network.manyathesocialnetwork.presentation.comment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.di.App;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

import javax.inject.Inject;

public class CommentActivity extends MvpAppCompatActivity implements CommentView {

    @Inject
    @InjectPresenter
    CommentPresenter presenter;

    @ProvidePresenter
    CommentPresenter providePostPresenter() {
        return presenter;
    }

    private CommentAdapter commentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        RecyclerView recyclerView = findViewById(R.id.feed_comment);

        Post post = (Post) getIntent().getSerializableExtra("POST");

        commentAdapter = new CommentAdapter(post);
        recyclerView.setAdapter(commentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        int id = post.getId();
        presenter.showComments(id);
    }

    @Override
    public void showComments(List<Comment> comments) {
        commentAdapter.loadComments(comments);
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
