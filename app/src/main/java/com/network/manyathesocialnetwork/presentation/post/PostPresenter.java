package com.network.manyathesocialnetwork.presentation.post;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

@InjectViewState
public class PostPresenter extends MvpPresenter<PostView> {
    private Post post;

    public PostPresenter(Post post) {
        this.post = post;
    }

    public void getComments(int id) {

    }
}
