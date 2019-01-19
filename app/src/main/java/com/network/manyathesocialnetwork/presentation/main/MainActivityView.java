package com.network.manyathesocialnetwork.presentation.main;

import com.arellomobile.mvp.MvpView;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

public interface MainActivityView extends MvpView {
   void addPost(Post newPost);
   void showError(String message);
}
