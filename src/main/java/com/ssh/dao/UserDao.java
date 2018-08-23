package com.ssh.dao;

import com.ssh.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * @param user
     * 登录
     */
    public User login(User user);

    /**
     * 注册
     */
    public boolean add(User user);


}
