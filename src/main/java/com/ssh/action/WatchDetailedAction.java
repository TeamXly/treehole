package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Comment;
import com.ssh.entity.Post;
import com.ssh.service.WatchDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("WatchDetailedAction")
@Scope("prototype")
public class WatchDetailedAction extends ActionSupport {
    private Comment comment;
    @Autowired
    WatchDetailedService watchDetailedService;


    public String UserWatchDetailed(){
       // System.out.println(comment.getC_postid());
        List<Post> posts=watchDetailedService.UserWatchPostService(comment);
        ActionContext.getContext().put("posts",posts);
        List<Comment> comments=watchDetailedService.UserWatchCommentService(comment);
        ActionContext.getContext().put("comments",comments);
        return SUCCESS;
    }

    public String ManagerWatchDetailed(){
        //System.out.println(comment.getC_postid());
        List<Post> posts=watchDetailedService.ManagerWatchPostService(comment);
        ActionContext.getContext().put("posts",posts);
        List<Comment> comments=watchDetailedService.ManagerWatchCommentService(comment);
        ActionContext.getContext().put("comments",comments);
        return SUCCESS;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
