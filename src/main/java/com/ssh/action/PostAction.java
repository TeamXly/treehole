package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Post;
import com.ssh.service.PostService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("PostAction")
@Scope("prototype")
public class PostAction extends ActionSupport{
   // private Post post;
    @Autowired
    private PostService ser;


    @Action(value = "/post",results = {
            @Result(name = "success", location = "/index.jsp")
//            @Result(name = "input", location = "/index.jsp")
    })
    @Override
    public String execute() throws Exception {
        List<Post> posts = ser.findAll();
        ActionContext.getContext().put("posts",posts);
        return SUCCESS;
    }


}
