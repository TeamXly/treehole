package com.ssh.service;

import com.ssh.entity.Post;

public interface ManagerService {
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
