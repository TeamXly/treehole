package com.ssh.dao.impl;


import com.ssh.dao.ManagerDao;
import com.ssh.entity.Post;
import org.hibernate.HibernateError;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
        try {
            if (post.isIsboutique()){
                String hql="update Post set isboutique=false where postid=:postid ";
                Query query=sessionFactory.getCurrentSession().createQuery(hql);
                query.setInteger("postid",post.getPostid());
                query.executeUpdate();
            }else {
                String hql="update Post set isboutique=true where postid=:postid";
                Query query=sessionFactory.getCurrentSession().createQuery(hql);
                query.setInteger("postid",post.getPostid());
                query.executeUpdate();
            }
            return true;
        }catch (HibernateError e){
            return false;
        }

    }

    @Override
    public boolean deletePost(Post post) {
        try {
            String hql1="DELETE  from Comment where c_postid=:c_postid";
            Query query1=sessionFactory.getCurrentSession().createQuery(hql1);
            query1.setInteger("c_postid",post.getPostid());
            query1.executeUpdate();

            String hql="DELETE from Post where postid=:postid";
            Query query=sessionFactory.getCurrentSession().createQuery(hql);
            query.setInteger("postid",post.getPostid());
            query.executeUpdate();
            return true;
        }catch (HibernateError e){
            return false;
        }
    }
}
