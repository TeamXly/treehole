package com.ssh.service;

import com.ssh.entity.User;

public interface UserService {
    public boolean add(User user);

    public boolean login(User user);
}
