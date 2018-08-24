package com.ssh.dao.impl;

import com.ssh.dao.ShowGoodPostDao;
import com.ssh.entity.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("ShowGoodPostDao")
@Transactional(noRollbackFor = Exception.class)
public class ShowGoodPostDaoImpl extends HibernateDaoSupport implements ShowGoodPostDao {
//
    @Autowired
    private SessionFactory sessionFactory;

    public ShowGoodPostDaoImpl(SessionFactory sessionfactory){
        setSessionFactory(sessionfactory);
    }
    @Override
    public List<Post> findGoodPost() {

        return (List<Post>) getHibernateTemplate().find("from Post where isboutique=true order by publishedtime desc");
//        System.out.println("ShowGoodPostDaoImpl...");
//        String hql = "from Post where isboutique=true order by publishedtime desc";
//        List<Post> list = sessionFactory.getCurrentSession().createQuery(hql).list();
//
//        return list;
    }
}
