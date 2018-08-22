package com.ssh.dao;

import com.ssh.entity.Post;

public interface LikeDislikeDao {
    public boolean like(Post post);

    public boolean dislike(Post post);
}
