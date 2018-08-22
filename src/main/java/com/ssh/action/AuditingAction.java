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

@Controller("AuditingAction")
@Scope("prototype")
public class AuditingAction extends ActionSupport{
    private Post post;
    @Autowired
    private PostService ser;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String Auditing() throws Exception{
        List<Post>  Auditing=ser.findAll_Auditing();
        ActionContext.getContext().put("Auditing",Auditing);
        return SUCCESS;
    }
}
