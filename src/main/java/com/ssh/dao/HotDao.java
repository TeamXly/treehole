package com.ssh.dao;

import com.ssh.entity.Post;

import java.util.List;

public interface HotDao<Post> {

    public List<Post> sortByLike();
}
