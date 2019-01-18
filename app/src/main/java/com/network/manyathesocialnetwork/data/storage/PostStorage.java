package com.network.manyathesocialnetwork.data.storage;

import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.ArrayList;

public class PostStorage {
    private ArrayList<Post> posts;

    Post getPostById(int id) {
        int i;
        for (i = 0; i < posts.size() && posts.get(i).getId() != id; i++) {}
        return posts.get(i);
    }
}
