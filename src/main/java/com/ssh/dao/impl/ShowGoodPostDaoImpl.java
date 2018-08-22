package com.ssh.dao.impl;

import com.ssh.dao.ShowGoodPostDao;
import com.ssh.entity.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("ShowGoodPostDao")
@Transactional(noRollbackFor = Exception.class)
public class ShowGoodPostDaoImpl implements ShowGoodPostDao {

    @Autowired
     private SessionFactory sessionFactory;

    @Override
    public List<Post> findGoodPost() {

        System.out.println("ShowGoodPostDaoImpl...");
        String hql = "from Post order by publishedtime desc";
        List<Post> list = sessionFactory.getCurrentSession().createQuery(hql).list();

        return list;
    }
}
