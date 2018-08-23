package com.ssh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.Post;
import com.ssh.service.ShowGoodPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.xml.ws.Action;
import java.util.ArrayList;
import java.util.List;

@Controller("ShowGoodPostAction")
@Scope("prototype")
public class ShowGoodPostAction extends ActionSupport {

    @Autowired
    private ShowGoodPostService showGoodPostService;

    public void setShowGoodPostService(ShowGoodPostService showGoodPostService) {
        this.showGoodPostService = showGoodPostService;
    }


    @Override
    public String execute() throws Exception {

        System.out.println("excute.....");
        List<Post> posts=showGoodPostService.findGoodPost();
//        List<Post> posts1=new ArrayList<>();

//        for (Post post:posts){
//            if (post.isIsboutique()==false){
//                posts1.add(post);
//            }
//        }

        ActionContext.getContext().put("posts",posts);
        return "success";
    }
}
