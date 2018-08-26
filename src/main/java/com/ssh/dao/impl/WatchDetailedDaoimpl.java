package com.ssh.dao.impl;

import com.ssh.dao.WatchDetailedDao;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("WatchDetailedDao")
@Transactional(rollbackFor = Exception.class)
public class WatchDetailedDaoimpl extends HibernateDaoSupport implements WatchDetailedDao {

    @Autowired
    private SessionFactory sessionFactory;

    public WatchDetailedDaoimpl(SessionFactory sessionfactory){
        setSessionFactory(sessionfactory);
    }
    @Override
    public List<Comment> UserWatchCommentDao(Comment comment) {
        String hql="from Comment c where c.c_postid=:postid";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("postid",comment.getC_postid());
        List<Comment> list=null;
        list=query.list();
        return list;
    }

    @Override
    public List<Post> UserWatchPostDao(Comment comment) {
        String hql="from Post where postid=:postid";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("postid",comment.getC_postid());
        List<Post> list=null;
        list=query.list();
        return list;
    }

    @Override
    public List<Comment> ManagerWatchCommentDao(Comment comment) {
        String hql="from Comment c where c.c_postid=:postid";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("postid",comment.getC_postid());
        List<Comment> list=null;
        list=query.list();
        return list;
    }

    @Override
    public List<Post> ManagerWatchPostDao(Comment comment) {
        String hql="from Post where postid=:postid";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("postid",comment.getC_postid());
        List<Post> list=null;
        list=query.list();
        return list;
    }
}
