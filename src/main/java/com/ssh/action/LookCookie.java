package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class LookCookie extends ActionSupport {
    @Override
    public String execute() throws Exception {
        HttpServletRequest request=ServletActionContext.getRequest();
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            //cookies[i].getName();//获得cookies名
            //cookies[i].getValue();//获得值
            System.out.println(cookies[i].getName()+cookies[i].getValue());
        }
        return "look";
    }
}
