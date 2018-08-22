package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Post;
import com.ssh.service.LikeDislikeService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller("LikeDislikeAction")//@Controller用于标注控制层组件，说明这个类是控制层组件
@Scope("prototype")
public class LikeDislikeAction extends ActionSupport{

    private static final long serialVersionUID = 1L;

    @Autowired LikeDislikeService likeDislikeService;

    private Post post=new Post();

    public String like() throws IOException {
        HttpServletRequest request=ServletActionContext.getRequest();
        int likenum= Integer.parseInt(request.getParameter("id"));
        int postid=Integer.parseInt(request.getParameter("postid"));
        post.setLike(likenum);
        post.setPostid(postid);
        this.likeDislikeService.like(post);
        return SUCCESS;
    }

    public String dislike() throws IOException{
        HttpServletRequest request=ServletActionContext.getRequest();
        int dislikenum= Integer.parseInt(request.getParameter("id"));
        int postid=Integer.parseInt(request.getParameter("postid"));
        post.setDislike(dislikenum);
        post.setPostid(postid);
        this.likeDislikeService.dislike(post);
        return SUCCESS;
    }


    public LikeDislikeService getLikeDislikeService() {
        return likeDislikeService;
    }

    public void setLikeDislikeService(LikeDislikeService likeDislikeService) {
        this.likeDislikeService = likeDislikeService;
    }
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
