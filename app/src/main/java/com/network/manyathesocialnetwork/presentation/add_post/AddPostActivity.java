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
import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.di.App;

import javax.inject.Inject;

public class AddPostActivity extends MvpAppCompatActivity implements AddPostView {

    @Inject
    @InjectPresenter
    AddPostPresenter presenter;

    @ProvidePresenter
    AddPostPresenter provideAddPostPresenter() {
        return presenter;
    }

    EditText etTitle, etBody;
    Post post; // make sure the title and the body are not empty
    Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        etTitle = findViewById(R.id.addTitle);
        etBody = findViewById(R.id.addBody);
        confirmButton = findViewById(R.id.confirm_add_button);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post = new Post(1, 0,  etTitle.getText().toString(), etBody.getText().toString());
                if (!post.getTitle().equals("") && !post.getBody().equals("")) {
                    presenter.createPost(post);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Repeat input", Toast.LENGTH_LONG).show();
                }
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
    public void addPostError(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
        setResult(0);
        finish();
    }
}
