package com.ssh.dao.impl;


import com.ssh.dao.ManagerDao;
import com.ssh.entity.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("ManagerDao")//@Repository用于标注数据访问组件，说明这个类是数据访问层组件
public class ManagerDaoimpl implements ManagerDao {
    @Autowired
    SessionFactory sessionFactory;


    @Override
    public boolean addFine(Post post) {
        return false;
    }

    @Override
    public boolean deletePost(Post post) {
        return false;
    }
}
