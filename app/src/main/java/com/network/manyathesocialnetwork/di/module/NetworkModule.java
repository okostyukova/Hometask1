package com.network.manyathesocialnetwork.di.module;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.network.manyathesocialnetwork.domain.repository.IPostRepository;
import com.network.manyathesocialnetwork.data.repository.PostRepository;

@Module
public class NetworkModule {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Provides
    Retrofit provideRetrofit() {
        return new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    IPostRepository providePostRepository(Retrofit retrofit) {
        return retrofit.create(PostRepository.class);
    }
}
