package com.ssh.action;


import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.UserDeleteService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller("UserDeleteAction")//@Controller用于标注控制层组件，说明这个类是控制层组件
@Scope("prototype")
public class UserDeleteAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    @Autowired
    UserDeleteService userDeleteService;
    private Post post;
    private Comment comment;

    public String UserDeletePost(){
//        HttpServletRequest request=ServletActionContext.getRequest();
//        int delete_Post=Integer.parseInt(request.getParameter("postid"));
//        post.setPostid(delete_Post);
        this.userDeleteService.deletePost(post);
        return SUCCESS;
    }

    public String UserDeleteComment(){
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
