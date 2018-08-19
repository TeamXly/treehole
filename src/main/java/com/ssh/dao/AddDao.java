package com.ssh.dao;

import com.ssh.entity.Comment;
import com.ssh.entity.Post;

public interface AddDao {
    /**
     * @param post
     * 添加帖子
     */
    public boolean addPost(Post post);
    /**
     * @param comment
     * 发表评论
     */
    public boolean addComment(Comment comment);
}
