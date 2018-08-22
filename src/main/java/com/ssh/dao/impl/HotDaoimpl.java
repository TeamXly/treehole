package com.ssh.dao.impl;

import com.ssh.dao.HotDao;
import com.ssh.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.bytecode.enhance.spi.EnhancementException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.regex.Matcher;

@Repository("HotDao")
@Transactional(rollbackFor = Exception.class)

public class HotDaoimpl implements HotDao {



    @Autowired SessionFactory sessionFactory;
    @Override
    public List<Post> sortByLike() {
        Session session = sessionFactory.getCurrentSession();
        List<Post> list = (List<Post>)session.createQuery("from Post post ORDER BY post.like desc ").list();
        return list;
    }
}








