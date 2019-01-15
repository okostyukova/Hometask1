package com.network.manyathesocialnetwork.main.mvp;

import com.arellomobile.mvp.MvpView;
import com.network.manyathesocialnetwork.post.common.PostItem;

import java.util.ArrayList;

public interface MainActivityView extends MvpView {
    void showPosts(ArrayList<PostItem> posts);
    void addPost();
}
