package com.network.manyathesocialnetwork.post.mvp;

import android.support.annotation.NonNull;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.network.manyathesocialnetwork.post.common.PostItem;

@InjectViewState
public class PostPresenter extends MvpPresenter<PostView> {
    private PostItem post;

    @Override
    public void attachView(PostView view) {
        super.attachView(view);
    }

    @Override
    public void detachView(PostView view) {
        super.detachView(view);
    }

    public void setPost(PostItem post) {
        this.post = post;
    }
}
