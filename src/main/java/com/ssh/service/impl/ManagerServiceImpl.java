package com.ssh.service.impl;

import com.ssh.dao.ManagerDao;
import com.ssh.entity.Post;
import com.ssh.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService {

    @Autowired private ManagerDao managerDao;
    @Override
    public boolean addFine(Post post) {
        if (managerDao.addFine(post)){
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePost(Post post) {
        if (managerDao.deletePost(post)){
            return true;
        }
        return false;
    }
}
