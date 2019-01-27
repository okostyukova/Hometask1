package com.network.manyathesocialnetwork.presentation.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.network.manyathesocialnetwork.presentation.post.PostActivity;
import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.R;

import java.util.ArrayList;

import com.network.manyathesocialnetwork.presentation.add_post.AddPostActivity;
import com.network.manyathesocialnetwork.di.App;

import javax.inject.Inject;


public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    @Inject
    @InjectPresenter
    MainActivityPresenter presenter;

    @ProvidePresenter
    MainActivityPresenter provideMainActivityPresenter() {
        return presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        init();
    }

    @Override
    public void addPost() {
        Intent intent = new Intent(this, AddPostActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    public void showPosts() {

    }

    @Override
    public void showComments() {
        Intent intent = new Intent(getApplicationContext(), PostActivity.class);
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }


    public void init() {
        RecyclerView recyclerView = findViewById(R.id.feed_recycler);

        ArrayList<Post> data = new ArrayList<>();

        MainAdapter mainAdapter = new MainAdapter(data, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PostActivity.class);
                startActivityForResult(intent, 2);
            }
        });
        recyclerView.setAdapter(mainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        presenter.showPosts();
    }
}
