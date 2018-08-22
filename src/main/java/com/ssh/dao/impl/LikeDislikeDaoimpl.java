package com.ssh.dao.impl;

import com.ssh.dao.LikeDislikeDao;
import com.ssh.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("LikeDislikeDao")//@Repository用于标注数据访问组件，说明这个类是数据访问层组件
public class LikeDislikeDaoimpl implements LikeDislikeDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public boolean like(Post post) {
        try{
            String hql="UPDATE Post p set p.like=:like where p.postid=:postid";
            Query query=sessionFactory.getCurrentSession().createQuery(hql);
            query.setInteger("like",post.getLike());
            query.setInteger("postid",post.getPostid());
            query.executeUpdate();
            return true;
        } catch (Exception e){
            return false;
        }
}

    @Override
    public boolean dislike(Post post) {
        try {
            String hql="UPDATE Post p set p.dislike=:dislike where p.postid=:postid";
            Query query=sessionFactory.getCurrentSession().createQuery(hql);
            query.setInteger("dislike",post.getDislike());
            query.setInteger("postid",post.getPostid());
            query.executeUpdate();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
