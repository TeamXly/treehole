package com.ssh.service.impl;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;
import com.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")//@Service用于标注业务层组件，说明这个类是业务层组件,名字无所谓
public class UserServiceImpl implements UserService {
    //@Resource
    @Autowired private UserDao userDao;

    @Override
    public boolean add(User user){
        this.userDao.add(user);
        return true;
    }

    @Override
    public boolean login(User user){
        if (this.userDao.login(user)){
            return true;
        }else {
           return false;
        }
    }
}
