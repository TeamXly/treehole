package com.ssh.dao.impl;

import com.ssh.dao.UserDao;

import com.ssh.entity.User;
import com.ssh.util.Csession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.bytecode.enhance.spi.EnhancementException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("UserDao")//@Repository用于标注数据访问组件，说明这个类是数据访问层组件
public class UserDaoimpl implements UserDao {
    @Autowired private SessionFactory sessionFactory;


    @Override
    public User login(User user){
        return (User) sessionFactory.getCurrentSession().createQuery("from User u where u.phone=:phone").setParameter("phone", user.getPhone()).uniqueResult();
//        String sql="select userid,password,username from user where phone=?";
//        Query query=sessionFactory.getCurrentSession().createSQLQuery(sql);
//        query.setString(1,user.getPhone());
//        List<Object> list=null;
//        list=query.list();
//        for (int i=0;i<list.size();i++) {
//            Object[] row = (Object[]) list.get(i);
//            System.out.println( row[0] + ":" +row[1] );
//        }
        //System.out.println(list.get(0));
    }
    public boolean add(User user){
        Session session=sessionFactory.openSession().getSession();
        Transaction tr=session.beginTransaction();
        try {
            user.setUserid(0);
            user.setType("普通用户");
            session.save(user);
            tr.commit();
            session.close();
            return true;
        }catch (EnhancementException e){
            return false;
        }
    }
}
