package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Post;
import com.ssh.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("ManagerAction")//@Controller用于标注控制层组件，说明这个类是控制层组件
@Scope("prototype")
public class ManagerAction extends ActionSupport {
    @Autowired
    ManagerService managerService;

    private Post post;

    public String addFine() {
        this.managerService.addFine(post);
        return SUCCESS;
    }


    public String deletePost() {
        this.managerService.deletePost(post);
        return SUCCESS;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }



}
