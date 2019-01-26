package com.network.manyathesocialnetwork.presentation.add_post;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
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

    public void addPost(int userId, int id, String title, String body, DataCallback<Post> callback) {
        addPostInteractor.addPost(userId, id, title, body, callback);
    }
}
