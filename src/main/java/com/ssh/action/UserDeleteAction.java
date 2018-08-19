package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.UserDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("UserDeleteAction")//@Controller用于标注控制层组件，说明这个类是控制层组件
@Scope("prototype")
public class UserDeleteAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    @Autowired
    UserDeleteService userDeleteService;


    public String UserDeletePost(Post post){
        return SUCCESS;
    }
    public String UserDeleteComment(Comment comment){
        return SUCCESS;
    }


    private Post post;

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

    private Comment comment;
}
