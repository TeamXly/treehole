package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Post;
import com.ssh.service.HotService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("HotAction")
@Scope("prototype")
public class HotAction extends ActionSupport{

    @Autowired
    private HotService hotService;
    private List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Action(value = "/hot",results = {
            @Result(name = "success", location = "/main.jsp")
    })

    public String sortByLike(){
        posts=hotService.sortByLike();
        ActionContext.getContext().getSession().put("posts",posts);
       // System.out.println("会不会出现"+posts);
        return SUCCESS;
    }
}
