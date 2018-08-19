package com.ssh.dao.impl;

import com.ssh.dao.UserDao;

import com.ssh.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.bytecode.enhance.spi.EnhancementException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("UserDao")//@Repository用于标注数据访问组件，说明这个类是数据访问层组件
public class UserDaoimpl implements UserDao {
    @Autowired private SessionFactory sessionFactory;

    @Override
    public Object[] login(User user){
        String sql="select password,username from user where phone=?";
        Query query=sessionFactory.getCurrentSession().createSQLQuery(sql);
        query.setString(1,user.getPhone());
        List list=query.list();
        Object[] obj=(Object[])list.get(0);
        return obj;
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
