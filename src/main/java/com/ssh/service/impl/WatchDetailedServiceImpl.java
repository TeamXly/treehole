package com.ssh.service.impl;

import com.ssh.dao.WatchDetailedDao;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.WatchDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("WatchDetailedService")//@Service用于标注业务层组件，说明这个类是业务层组件,名字无所谓
public class WatchDetailedServiceImpl implements WatchDetailedService {
    @Autowired
    WatchDetailedDao watchDetailedDao;
    @Override
    public List<Comment> UserWatchCommentService(Comment comment) {
        return watchDetailedDao.UserWatchCommentDao(comment);
    }

    @Override
    public List<Post> UserWatchPostService(Comment comment) {
        return watchDetailedDao.UserWatchPostDao(comment);
    }

    @Override
    public List<Comment> ManagerWatchCommentService(Comment comment) {
        return watchDetailedDao.ManagerWatchCommentDao(comment);
    }

    @Override
    public List<Post> ManagerWatchPostService(Comment comment) {
        return watchDetailedDao.UserWatchPostDao(comment);
    }
}
