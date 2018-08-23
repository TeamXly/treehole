package com.ssh.service.impl;

import com.ssh.dao.CommentDao;
import com.ssh.entity.Comment;
import com.ssh.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CommentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
    @Override
    public List<Comment> findall() {
        return this.commentDao.findall();
    }
}
