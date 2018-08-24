package com.ssh.service.impl;

import com.ssh.dao.UserDeleteDao;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.UserDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserDeleteService")//@Service用于标注业务层组件，说明这个类是业务层组件,名字无所谓
public class UserDeleteServiceImpl implements UserDeleteService {

    @Autowired UserDeleteDao userDeleteDao;

    @Override
    public boolean deletePost(Post post) {
        if(this.userDeleteDao.deletePost(post)) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteComment(Comment comment) {
        return false;
    }

}
