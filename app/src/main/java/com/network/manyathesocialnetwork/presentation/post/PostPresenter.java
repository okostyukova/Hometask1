package com.network.manyathesocialnetwork.presentation.post;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.network.manyathesocialnetwork.domain.entity.Post;

@InjectViewState
public class PostPresenter extends MvpPresenter<PostView> {
    private Post post;

    @Override
    public void attachView(PostView view) {
        super.attachView(view);
    }

    @Override
    public void detachView(PostView view) {
        super.detachView(view);
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
