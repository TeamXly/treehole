package com.ssh.service;

import com.ssh.entity.User;

import java.util.List;

public interface UserService {
    public boolean add(User user);

    public User login(User user);
}
