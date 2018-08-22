package com.ssh.service.impl;

import com.ssh.dao.PostDao;
import com.ssh.entity.Post;
import com.ssh.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PostService")
public class PostServiceImpl implements PostService {
    @Autowired private PostDao idd;


    public List<Post> findAll() {
        // TODO Auto-generated method stub
        return this.idd.findAll();
    }
    public List<Post> findAll_Center(int userid){
        return this.idd.findAll_Center(userid);
    }

    public List<Post> findAll_Auditing(){
        return this.idd.findAll_Auditing();
    }

}
