package com.network.manyathesocialnetwork.presentation.addPost;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import com.network.manyathesocialnetwork.domain.interactor.AddPostInteractor;
import com.network.manyathesocialnetwork.domain.entity.Post;

import javax.inject.Inject;

@InjectViewState
public class AddPostPresenter extends MvpPresenter<AddPostView> {
    private AddPostInteractor addPostInteractor;

    @Inject
    AddPostPresenter(AddPostInteractor addPostInteractor) {
        this.addPostInteractor = addPostInteractor;
    }

    public void addPost() {
        addPostInteractor.addPost();
    }
}
