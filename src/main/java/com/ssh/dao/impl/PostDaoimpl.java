package com.ssh.dao.impl;


import com.ssh.dao.PostDao;
import com.ssh.entity.Post;
import org.hibernate.SessionFactory;
import org.hibernate.bytecode.enhance.spi.EnhancementException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.regex.Matcher;

@Repository("PostDao")
@Transactional(rollbackFor = Exception.class)

public class PostDaoimpl extends HibernateDaoSupport implements PostDao {


    public PostDaoimpl(SessionFactory sessionfactory){
        setSessionFactory(sessionfactory);
    }
    @Override
    public List<Post> findAll() {

       return (List<Post>) getHibernateTemplate().find("from Post");

    }
}








