package com.ssh.dao;

import com.ssh.entity.Post;

public interface ManagerDao {
    /**
     * @param post
     * 加精
     */
    public boolean addFine(Post post);

    /**
     * @param post
     * 删帖
     */
    public boolean deletePost(Post post);
}
