package com.network.manyathesocialnetwork.presentation.comment;

import com.arellomobile.mvp.MvpView;

import com.network.manyathesocialnetwork.domain.entity.Comment;

import java.util.List;

public interface CommentView extends MvpView {
    void showComments(List<Comment> comments);
    void showError(String msg);
}
