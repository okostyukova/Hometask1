package com.network.manyathesocialnetwork.presentation.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.network.manyathesocialnetwork.presentation.comment.CommentActivity;
import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.R;

import java.util.ArrayList;
import java.util.List;

import com.network.manyathesocialnetwork.presentation.add_post.AddPostActivity;
import com.network.manyathesocialnetwork.di.App;

import javax.inject.Inject;

public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    final static String ERROR = "Error";

    @Inject
    @InjectPresenter
    MainActivityPresenter presenter;

    @ProvidePresenter
    MainActivityPresenter provideMainActivityPresenter() {
        return presenter;
    }

    private MainAdapter mainAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        init();

        Button addPostButton = findViewById(R.id.add_post_btn);
        addPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddPostActivity.class);
                startActivityForResult(intent, 1);
            }
        });

        presenter.showPosts();
    }

    @Override
    public void showPosts(List<Post> posts) {
        mainAdapter.loadPosts(posts);
    }

    @Override
    public void addPost(Post post) {
        mainAdapter.loadPost(post);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1) {
                Post newPost = (Post) data.getExtras().getSerializable("POST");
                if (newPost != null) {
                    addPost(newPost);
                    Toast.makeText(getApplicationContext(), "New post created" , Toast.LENGTH_LONG).show();
                }
            }
        else {
            showError(ERROR);
        }
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public void init() {
        recyclerView = findViewById(R.id.feed_recycler);

        List<Post> data = new ArrayList<>();

        mainAdapter = new MainAdapter(data, new MainAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Post post) {
                presenter.showComments(post);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mainAdapter);
    }

    @Override
    public void showComments(Post post) {
        Intent intent = new Intent(MainActivity.this, CommentActivity.class);
        intent.putExtra("POST", post);
        startActivity(intent);
    }
}
