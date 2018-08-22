package com.ssh.service.impl;

import com.ssh.dao.HotDao;
import com.ssh.entity.Post;
import com.ssh.service.HotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import java.util.List;

@Service("HotService")
public class HotServiceImpl implements HotService {
    @Autowired  HotDao hotdao;
    @Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
    public List<Post> sortByLike() {

        List<Post> posts=hotdao.sortByLike();
        if(posts.isEmpty()){
            return null;
        }
       return posts;
    }

}
