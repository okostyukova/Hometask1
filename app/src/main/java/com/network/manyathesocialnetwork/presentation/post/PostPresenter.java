package com.network.manyathesocialnetwork.presentation.post;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import com.network.manyathesocialnetwork.domain.interactor.CommentInteractor;
import com.network.manyathesocialnetwork.domain.entity.Post;

import javax.inject.Inject;

@InjectViewState
public class PostPresenter extends MvpPresenter<PostView> {
    private Post post;

    @Inject
    private CommentInteractor commentInteractor;

    public PostPresenter(Post post) {
        this.post = post;
    }

    public void showComments(int id) {
        commentInteractor.getComments(id);
    }
}
