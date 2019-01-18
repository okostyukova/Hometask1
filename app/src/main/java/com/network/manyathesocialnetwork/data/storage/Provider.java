package com.network.manyathesocialnetwork.data.storage;

import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

public interface Provider {
    interface IPostStorage {
        Post getPost(int id);
        void addPost();
    }
    interface ICommentStorage {
        Comment getComment();
    }
}
