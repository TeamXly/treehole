package com.ssh.service;

import com.ssh.entity.Post;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public List<Post> findAll_Center(int userid);
    public List<Post> findAll_Auditing();
}
