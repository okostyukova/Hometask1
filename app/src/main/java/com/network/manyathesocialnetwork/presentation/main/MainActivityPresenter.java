package com.network.manyathesocialnetwork.presentation.main;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.interactor.PostInteractor;

import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

import javax.inject.Inject;

@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView> {

    private PostInteractor postInteractor;

    @Inject
    MainActivityPresenter(PostInteractor postInteractor) {
        this.postInteractor = postInteractor;
    }

    public void showPosts() {
        postInteractor.getPosts(new DataCallback<Post>() {
            @Override
            public void onSuccess(List<Post> posts) {
                getViewState().showPosts();
            }

            @Override
            public void onSuccessOneObject(Post post) {}

            @Override
            public void onError(String msg) {
                getViewState().showError("Error");
            }
        });
    }

}
