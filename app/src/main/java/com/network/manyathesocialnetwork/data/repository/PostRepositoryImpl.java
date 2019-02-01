package com.network.manyathesocialnetwork.data.repository;

import android.support.annotation.NonNull;

import com.network.manyathesocialnetwork.domain.entity.Post;
import com.network.manyathesocialnetwork.domain.repository.PostRepository;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.data.api.*;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.network.manyathesocialnetwork.domain.callback.DataCallback;

import javax.inject.Inject;

public class PostRepositoryImpl implements PostRepository {

    private final String ERROR_MESSAGE = "Something went wrong :(";

    private ApiInterface apiInterface;

    @Inject
    public PostRepositoryImpl(ApiInterface apiInterface) {
        this.apiInterface = apiInterface;
    }

    @Override
    public void getPosts(final DataCallback<Post> callback) {
        ApiService.getApiInterface()
                .getPosts()
                .enqueue(new Callback<List<Post>>() {
                    @Override
                    public void onResponse(@NonNull Call<List<Post>> call, @NonNull Response<List<Post>> response) {
                        if (response.body() != null) {
                            callback.onSuccess(response.body());
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<List<Post>> call, @NonNull Throwable t) {
                        callback.onError(ERROR_MESSAGE);
                    }
                });
    }

    @Override
    public void getComments(int id, final DataCallback<Comment> callback) {
        ApiService.getApiInterface()
                .getComments(id)
                .enqueue(new Callback<List<Comment>>() {
                    @Override
                    public void onResponse(@NonNull Call<List<Comment>> call, @NonNull Response<List<Comment>> response) {
                        if (response.body() != null) {
                            callback.onSuccess(response.body());
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<List<Comment>> call, @NonNull Throwable t) {
                        callback.onError(ERROR_MESSAGE);
                    }
                });
    }

    @Override
    public void addPost(Post post, final DataCallback<Post> callback) {
        ApiService.getApiInterface()
                .addPost(post)
                .enqueue(new Callback<Post>() {
                    @Override
                    public void onResponse(@NonNull Call<Post> call, @NonNull Response<Post> response) {
                        if (response.body() != null) {
                            callback.onSuccess(response.body());
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<Post> call, Throwable t) {
                        callback.onError(ERROR_MESSAGE);
                    }
                });
    }
}
