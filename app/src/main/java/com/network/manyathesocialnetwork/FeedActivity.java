package com.network.manyathesocialnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        RecyclerView recyclerView = findViewById(R.id.feed_recycler);

        ArrayList<PostItem> data = new ArrayList<>();
        data.add(new PostItem(1, 1, "qwerty", "asdfghjkl"));
        data.add(new PostItem(2, 2, "qwerty2", "asdfghjkl2"));
        data.add(new PostItem(3, 3, "qwerty3", "asdfghjkl3"));
        data.add(new PostItem(4, 3, "qwerty3", "asdfghjkl3"));
        data.add(new PostItem(5, 3, "qwerty3", "asdfghjkl3"));
        data.add(new PostItem(6, 3, "qwerty3", "asdfghjkl3"));
        data.add(new PostItem(7, 3, "qwerty3", "asdfghjkl3"));
        data.add(new PostItem(8, 3, "qwerty3", "asdfghjkl3"));
        data.add(new PostItem(9, 3, "qwerty3", "asdfghjkl3"));
        data.add(new PostItem(10, 3, "qwerty3", "asdfghjkl3"));

        PostAdapter postAdapter = new PostAdapter(data);
        recyclerView.setAdapter(postAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
