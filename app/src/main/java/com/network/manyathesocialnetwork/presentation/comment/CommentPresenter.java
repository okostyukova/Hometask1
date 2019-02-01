package com.network.manyathesocialnetwork.presentation.comment;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.interactor.CommentInteractor;

import java.util.List;

import javax.inject.Inject;

@InjectViewState
public class CommentPresenter extends MvpPresenter<CommentView> {

    private CommentInteractor commentInteractor;

    @Inject
    public CommentPresenter(CommentInteractor commentInteractor) {
        this.commentInteractor = commentInteractor;
    }

    public void showComments(int id) {
        commentInteractor.getComments(id, new DataCallback<Comment>() {
            @Override
            public void onSuccess(List<Comment> comments) {
                getViewState().showComments(comments);
            }

            @Override
            public void onSuccess(Comment temp) {}

            @Override
            public void onError(String message) {
                getViewState().showError("Error");
            }
        });
    }
}
