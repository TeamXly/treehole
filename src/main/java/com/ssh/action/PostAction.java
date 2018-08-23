package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.CommentService;
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
    private Post post;
    private Comment comment;
    @Autowired
    private PostService ser;
    @Autowired private CommentService commentService;

    public Comment getComment() {
        return comment;
    }
    public void setComment(Comment comment) {
        this.comment = comment;
    }
    public Post getPost() {
  return post;
 }
 public void setPost(Post post) {
  this.post = post;
 }

 @Action(value = "/post",results = {
            @Result(name = "success", location = "/main.jsp")
//            @Result(name = "input", location = "/index.jsp")
    })
    @Override
    public String execute() throws Exception {
       List<Post> posts = ser.findAll();
        ActionContext.getContext().put("posts",posts);
        List<Comment> comments=commentService.findall();
     ActionContext.getContext().put("comments",comments);
        return SUCCESS;
    }
}
