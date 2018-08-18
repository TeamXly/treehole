package com.ssh.dao;

import com.ssh.entity.User;

public interface UserDao {
    /**
     * @param user
     * 登录
     */
    public boolean login(User user);

    /**
     * 注册
     */
    public void add(User user);


}
