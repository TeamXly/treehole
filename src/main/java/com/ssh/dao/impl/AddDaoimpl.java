package com.ssh.dao.impl;

import com.ssh.dao.AddDao;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.bytecode.enhance.spi.EnhancementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("AddDao")//@Repository用于标注数据访问组件，说明这个类是数据访问层组件
public class AddDaoimpl implements AddDao {

    @Autowired private SessionFactory sessionFactory;


    @Override
    public boolean addPost(Post post){
        Session session=sessionFactory.openSession().getSession();
        Transaction tr=session.beginTransaction();
        //Date d=new Date();

        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Timestamp ts = new Timestamp(new Date().getTime());

        System.out.println(ts);
        post.setPostid(0);
        post.setPublishedtime(ts);
        post.setLike(0);
        post.setDislike(0);
        post.setIsboutique(false);
        System.out.print(post.getPublishedtime());
        // System.out.print(post.getLike());
        //System.out.print(post.getDislike());
        System.out.print(post.isIsboutique());
        try{
            session.save(post);
            tr.commit();
            session.close();
        }catch (EnhancementException e){
            return false;
        }

        return true;
//        添加帖子的数据库操作
    }

    public boolean addComment(Comment comment){
        Session session=sessionFactory.openSession().getSession();
        Transaction tr=session.beginTransaction();
        session.save(comment);
        tr.commit();
        session.close();
        // 添加回复的数据库操作
        return true;
    }

}
