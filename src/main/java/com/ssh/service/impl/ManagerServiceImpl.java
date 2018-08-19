package com.ssh.service.impl;

import com.ssh.entity.Post;
import com.ssh.service.ManagerService;
import org.springframework.stereotype.Service;

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService {
    @Override
    public boolean addFine(Post post) {
        return false;
    }

    @Override
    public boolean deletePost(Post post) {
        return false;
    }
}
