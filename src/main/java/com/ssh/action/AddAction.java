package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.AddService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller("AddAction")//@Controller用于标注控制层组件，说明这个类是控制层组件
@Scope("prototype")
public class AddAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Autowired
    AddService addService;

    private Post post;
    private Comment comment;

    public String addPost(){
        System.out.println("action调用");
        HttpServletRequest request=ServletActionContext.getRequest();
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            //cookies[i].getName();//获得cookies名
            //cookies[i].getValue();//获得值
            System.out.println(cookies[i].getName() + cookies[i].getValue());
            if(cookies[i].getName().equals("userid")){

                post.setUserid(Integer.valueOf(cookies[i].getValue()));
            }
        }
        //post.setUserid(Integer.valueOf(cookies[1].getValue()));

        if(addService.addPost(post)){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
    public String addcomment(){
        return SUCCESS;
    }




    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
