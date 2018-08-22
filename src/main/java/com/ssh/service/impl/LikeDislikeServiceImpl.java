package com.ssh.service.impl;

import com.ssh.dao.LikeDislikeDao;
import com.ssh.entity.Post;
import com.ssh.service.LikeDislikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LikeDislikeServiceService")//@Service用于标注业务层组件，说明这个类是业务层组件,名字无所谓
public class LikeDislikeServiceImpl implements LikeDislikeService {
    @Autowired private LikeDislikeDao likeDislikeDao;
    @Override
    public boolean like(Post post) {
        if(this.likeDislikeDao.like(post)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean dislike(Post post) {
        if(this.likeDislikeDao.dislike(post)){
            return true;
        }else {
            return false;
        }
    }
}
