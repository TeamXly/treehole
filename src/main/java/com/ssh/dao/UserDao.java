package com.ssh.dao;

import com.ssh.entity.User;

public interface UserDao {
    /**
     * @param user
     * 登录
     */
    public Object[] login(User user);

    /**
     * 注册
     */
    public boolean add(User user);


}
