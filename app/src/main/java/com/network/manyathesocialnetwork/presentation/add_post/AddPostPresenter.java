package com.network.manyathesocialnetwork.presentation.add_post;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;
import com.network.manyathesocialnetwork.domain.interactor.AddPostInteractor;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

import javax.inject.Inject;

@InjectViewState
public class AddPostPresenter extends MvpPresenter<AddPostView> {

    private AddPostInteractor addPostInteractor;

    @Inject
    AddPostPresenter(AddPostInteractor addPostInteractor) {
        this.addPostInteractor = addPostInteractor;
    }

    public void createPost(Post post) {
        addPostInteractor.addPost(post, new DataCallback<Post>() {
            @Override
            public void onSuccess(List<Post> list) {}

            @Override
            public void onSuccess(Post post) {
                getViewState().addPost(post);
            }

            @Override
            public void onError(String message) {
                getViewState().addPostError();
            }
        });
    }
}
