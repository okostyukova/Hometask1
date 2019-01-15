package com.network.manyathesocialnetwork.main.mvp;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView> {
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
}
