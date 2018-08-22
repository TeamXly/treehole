package com.ssh.dao;

import com.ssh.entity.Post;

import java.util.List;

public interface PostDao<Post> {
    /**
     *
     * @return
     */
    List<Post> findAll();
    List<Post> findAll_Center(int userid);
    List<Post> findAll_Auditing();
}
