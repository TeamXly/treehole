package com.ssh.dao.impl;


import com.ssh.dao.PostDao;
import com.ssh.entity.Post;
import org.hibernate.SessionFactory;
import org.hibernate.bytecode.enhance.spi.EnhancementException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("PostDao")
@Transactional(rollbackFor = Exception.class)

public class PostDaoimpl implements PostDao {
    @Autowired
    private SessionFactory sessionFactory;

//    public PostDaoimpl(SessionFactory sessionfactory){
//        this.sessionFactory=sessionfactory;
//    }

//    @Override
//    public List<Post> findAll() {
//        String sql="SELECT `user`.username,post.* FROM `user`,post WHERE `user`.userid=post.userid ORDER BY post.publishedtime DESC";
//        Query query=sessionFactory.getCurrentSession().createSQLQuery(sql);
////        List<Object> obj= (List<Object>) sessionFactory.getCurrentSession().createQuery("From Post");
//        ArrayList<Post> result = new ArrayList<>();
//
//
//    }
    @Override
    public List<Post> findAll() {
        // TODO Auto-generated method stub
        //查询获取全部的数据

        String sql= "SELECT * from post";
        Query query=sessionFactory.openSession().createSQLQuery(sql);
            List<Post> list=null;
            list=query.list();
//            for (int i=0;i<list.size();i++){
//                Object[] obj=(Object[])list.get(i);
//                System.out.println(obj[0]+":"+obj[1]);
//            }
            return list;

        //return list;
    }

//    public static void main(String[] args) {
//        @Autowired PostDao postDao;
//        postDao.findAll();
//    }



}





