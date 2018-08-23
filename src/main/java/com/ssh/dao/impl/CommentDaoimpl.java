package com.ssh.dao.impl;

import com.ssh.dao.CommentDao;
import com.ssh.entity.Comment;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
//出现Exception异常回滚
@Repository("CommentDao")//@Repository用于标注数据访问组件，说明这个类是数据访问层组件
public class CommentDaoimpl extends HibernateDaoSupport implements CommentDao {
    @Autowired
    private SessionFactory sessionFactory;
    public CommentDaoimpl(SessionFactory sessionfactory){
        setSessionFactory(sessionfactory);
    }
    @Override
    public List<Comment> findall() {
        return (List<Comment>) getHibernateTemplate().find("from Comment ORDER BY publishedtime asc ");
    }
}
