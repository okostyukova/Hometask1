package com.network.manyathesocialnetwork.presentation.main;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import com.network.manyathesocialnetwork.domain.interactor.PostInteractor;

import javax.security.auth.callback.Callback;

@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView> {

    PostInteractor postInteractor;

    @Override
    public void attachView(MainActivityView view) {
        super.attachView(view);
    }

    @Override
    public void detachView(MainActivityView view) {
        super.detachView(view);
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

    }

    public void showPosts(Callback callback) {
        postInteractor.getPosts(callback);
    }
}
