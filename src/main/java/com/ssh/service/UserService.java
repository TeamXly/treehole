package com.ssh.service;

import com.ssh.entity.User;

import java.util.List;

public interface UserService {
    public boolean add(User user);

    public List login(User user);
}
