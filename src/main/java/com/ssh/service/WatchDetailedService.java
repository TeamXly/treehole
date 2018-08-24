package com.ssh.service;

import com.ssh.entity.Comment;
import com.ssh.entity.Post;

import java.util.List;

public interface WatchDetailedService {
    public List<Comment> UserWatchCommentService(Comment comment);
    public List<Post> UserWatchPostService(Comment comment);


    public List<Comment> ManagerWatchCommentService(Comment comment);
    public List<Post> ManagerWatchPostService(Comment comment);
}
