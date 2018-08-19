package com.ssh.dao.impl;

import com.ssh.dao.AddDao;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("AddDao")//@Repository用于标注数据访问组件，说明这个类是数据访问层组件
public class AddDaoimpl implements AddDao {
    @Autowired private SessionFactory sessionFactory;

    @Override
    public boolean addPost(Post post){
        return true;
//        添加帖子的数据库操作
    }

    public boolean addComment(Comment comment){
        // 添加回复的数据库操作
        return true;
    }

}
