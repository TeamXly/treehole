package com.ssh.service;

import com.ssh.entity.Post;

public interface LikeDislikeService {
    public boolean like(Post post);

    public boolean dislike(Post post);
}
