package com.network.manyathesocialnetwork.presentation.main;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.network.manyathesocialnetwork.presentation.post.PostAdapter;
import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.R;


import java.util.ArrayList;

import javax.inject.Inject;


public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    @Inject
    @InjectPresenter
    MainActivityPresenter presenter;

    @Inject
    PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        RecyclerView recyclerView = findViewById(R.id.feed_recycler);

        ArrayList<Post> data = new ArrayList<>();
        data.add(new Post(1, 1, "qwerty", "asdfghjkl"));
        data.add(new Post(2, 2, "qwerty2", "asdfghjkl2"));
        data.add(new Post(3, 3, "qwerty3", "asdfghjkl3"));
        data.add(new Post(4, 3, "qwerty3", "asdfghjkl3"));
        data.add(new Post(5, 3, "qwerty3", "asdfghjkl3"));
        data.add(new Post(6, 3, "qwerty3", "asdfghjkl3"));
        data.add(new Post(7, 3, "qwerty3", "asdfghjkl3"));
        data.add(new Post(8, 3, "qwerty3", "asdfghjkl3"));
        data.add(new Post(9, 3, "qwerty3", "asdfghjkl3"));
        data.add(new Post(10, 3, "qwerty3", "asdfghjkl3"));

        PostAdapter postAdapter = new PostAdapter(data);
        recyclerView.setAdapter(postAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void showPosts(ArrayList<Post> posts) {
        RecyclerView recyclerView = findViewById(R.id.feed_recycler);


    }

//    @Override
//    public  void addPost(Post newPost) { }
}