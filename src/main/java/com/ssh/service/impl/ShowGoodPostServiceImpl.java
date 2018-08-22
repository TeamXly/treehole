package com.ssh.service.impl;



import com.ssh.dao.ShowGoodPostDao;
import com.ssh.entity.Post;
import com.ssh.service.ShowGoodPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("ShowGoodPostService")
public class ShowGoodPostServiceImpl  implements ShowGoodPostService {

    @Autowired private ShowGoodPostDao showGoodPostDao;

    @Override
    public List<Post> findGoodPost() {

        System.out.println("ShowGoodPostServiceImpl...");
        return showGoodPostDao.findGoodPost();
    }
}
