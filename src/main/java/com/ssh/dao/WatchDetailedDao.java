package com.ssh.dao;

import com.ssh.entity.Comment;
import com.ssh.entity.Post;

import java.util.List;

public interface WatchDetailedDao {
    public List<Comment> UserWatchCommentDao(Comment comment);
    public List<Post> UserWatchPostDao(Comment comment);


    public List<Comment> ManagerWatchCommentDao(Comment comment);
    public List<Post> ManagerWatchPostDao(Comment comment);
}
