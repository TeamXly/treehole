package com.ssh.util;

import com.ssh.entity.User;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
@Service("cookieAction")//@Controller用于标注控制层组件，说明这个类是控制层组件
@Scope("prototype")
public class Csession {
    public boolean getcsession(User user){
        HttpServletResponse response = ServletActionContext.getResponse();
        //设置cookie
        Cookie username = new Cookie("username",String.valueOf(user.getUsername()));
        Cookie userid = new Cookie("userid",String.valueOf(user.getUserid()));
        response.addCookie(username);
        response.addCookie(userid);
        username.setMaxAge(-1);
        return true;
    }
}
