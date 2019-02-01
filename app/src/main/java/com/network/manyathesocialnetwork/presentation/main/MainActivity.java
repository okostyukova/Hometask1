package com.network.manyathesocialnetwork.presentation.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.network.manyathesocialnetwork.presentation.comment.CommentActivity;
import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.R;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        init();
        presenter.showPosts();

        Button addPostButton = findViewById(R.id.add_post_btn);
        addPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getApplicationContext(), AddPostActivity.class), 1);
            }
        });
    }

    @Override
    public void showPosts(List<Post> posts) {
        mainAdapter.loadPosts(posts);
    }

    @Override
    public void showPost(Post post) {
        mainAdapter.loadPost(post);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1) {
            if (data != null) {
                Post post = (Post) data.getExtras().getSerializable("POST");
                if (post != null) {
                    presenter.showPosts();
                }
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
        RecyclerView recyclerView = findViewById(R.id.feed_recycler);

        mainAdapter = new MainAdapter(new MainAdapter.OnItemClickListener() {
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
