package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Post;
import com.ssh.entity.User;
import com.ssh.service.PostService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

@Controller("PostCenterAction")
@Scope("prototype")
public class post_centerAction extends ActionSupport {
    private Post post;
    @Autowired
    private PostService ser;
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    public String post_center() throws Exception{

//        HttpServletRequest request=ServletActionContext.getRequest();
//        Cookie[] cookies = request.getCookies();
//        int userid=0;
//        for (int i = 0; i < cookies.length; i++) {
//            if(cookies[i].getName().equals("userid")){
//                userid= Integer.parseInt(cookies[i].getValue());
//            }
//        }
        User user=(User)ActionContext.getContext().getSession().get("session_in_user");
        List<Post> posts1=ser.findAll_Center(user.getUserid());
        /* user对象放到值栈中的map里
         * */
        ActionContext.getContext().put("post_center",posts1);
        return  SUCCESS;
    }
}
