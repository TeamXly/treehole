package com.ssh.service;

import com.ssh.entity.Comment;
import com.ssh.entity.Post;

public interface AddService {
    public boolean addPost(Post post);

    public boolean addComment(Comment comment);
}
