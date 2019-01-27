package com.network.manyathesocialnetwork.di.module;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.network.manyathesocialnetwork.domain.repository.PostRepository;
import com.network.manyathesocialnetwork.data.repository.PostRepositoryImpl;
import com.network.manyathesocialnetwork.data.api.ApiInterface;

@Module
public class NetworkModule {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Provides
    PostRepository providePostRepository() {

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return new PostRepositoryImpl(retrofit.create(ApiInterface.class));
    }
}
