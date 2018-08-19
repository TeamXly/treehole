package com.ssh.service;

import com.ssh.entity.Comment;
import com.ssh.entity.Post;

public interface UserDeleteService {
    /**
     * @param post
     * 用户删除帖子
     */
    public boolean deletePost(Post post);

    /**
     * @param comment
     * 用户删除评论
     */
    public boolean deleteComment(Comment comment);
}
