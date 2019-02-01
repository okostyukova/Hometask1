package com.network.manyathesocialnetwork.presentation.add_post;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.di.App;

public class AddPostActivity extends MvpAppCompatActivity implements AddPostView {

    @InjectPresenter
    AddPostPresenter presenter;

    @ProvidePresenter
    AddPostPresenter provideAddPostPresenter() {
        return presenter;
    }

    EditText etTitle = findViewById(R.id.addTitle);
    EditText etBody = findViewById(R.id.addBody);
    Post post = new Post(1, etTitle.getText().toString(), etBody.getText().toString());
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        Button confirmButton = findViewById(R.id.confirm_add_button);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.createPost(post);
            }
        });
    }

    @Override
    public void addPost(Post post) {
        Intent intent = getIntent();
        intent.putExtra("POST", post);
        setResult(1, intent);
        finish();
    }

    @Override
    public void addPostError() {
        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        setResult(0);
        finish();
    }
}
