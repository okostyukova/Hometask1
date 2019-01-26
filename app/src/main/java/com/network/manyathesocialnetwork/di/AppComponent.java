package com.network.manyathesocialnetwork.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

import com.network.manyathesocialnetwork.di.module.NetworkModule;
import com.network.manyathesocialnetwork.presentation.main.MainActivity;
import com.network.manyathesocialnetwork.presentation.post.PostActivity;
import com.network.manyathesocialnetwork.presentation.add_post.AddPostActivity;

@Singleton
@Component(modules = {NetworkModule.class})
public interface AppComponent {

        void inject(MainActivity mainActivity);
        void inject(PostActivity postActivity);
        void inject(AddPostActivity addPostActivity);

        @Component.Builder
        interface Builder {
            AppComponent build();

            @BindsInstance
            Builder context(Context context);
        }

}
