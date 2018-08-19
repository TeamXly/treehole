package com.ssh.service.impl;

import com.ssh.dao.AddDao;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AddService")//@Service用于标注业务层组件，说明这个类是业务层组件,名字无所谓
public class AddServiceImpl implements AddService {
    @Autowired private AddDao addDao;

    @Override
    public boolean addPost(Post post){
        if (this.addDao.addPost(post)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean addComment(Comment comment){
        if(this.addDao.addComment(comment)){
            return true;
        }else {
            return false;
        }
    }
}
