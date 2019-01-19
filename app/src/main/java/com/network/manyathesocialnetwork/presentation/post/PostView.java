package com.network.manyathesocialnetwork.presentation.post;

import com.arellomobile.mvp.MvpView;

import com.network.manyathesocialnetwork.domain.entity.Comment;

import java.util.List;

public interface PostView extends MvpView {
    void showComments(List<Comment> comments);
}
