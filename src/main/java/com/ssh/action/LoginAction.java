package com.ssh.action;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.User;
import com.ssh.service.UserService;
import org.apache.struts2.ServletActionContext;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static org.apache.struts2.interceptor.DateTextFieldInterceptor.DateWord.s;

@Controller("UserAction")//@Controller用于标注控制层组件，说明这个类是控制层组件
@Scope("prototype")
public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Autowired UserService userService;

    private User user;

    public String login(){
        List<Object> list=userService.login(user);
        if (!list.isEmpty()){
            Object[] row = (Object[]) list.get(0);
            System.out.println(user.getPassword()+row[1]);
            System.out.println("list not null");
            if (user.getPassword().equals(row[1])){
                System.out.println("list ==");
                HttpServletResponse response = ServletActionContext.getResponse();
                //设置cookie
                Cookie username = new Cookie("username",String.valueOf(row[2]));
                Cookie userid = new Cookie("userid",String.valueOf(row[0]));
                response.addCookie(username);
                response.addCookie(userid);

                username.setMaxAge(-1);
                return SUCCESS;
            }else {
                return ERROR;
            }
        }else {
            return ERROR;
        }

    }
    public String register(){
        if (userService.add(user)){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
}
//    @Resource
//    private UserService userService;
//
//    private User user;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }









    //封装后但未整合框架的操作
//    @Override
//    public String execute() throws Exception {
//
//        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDaoimpl userDaoimpl =(UserDaoimpl)ac.getBean("LoginDao");
//        if(userDaoimpl.login(username,password)){
//            return "success";
//        }else {
//            return "error";
//        }
//  }
//



//        最初的操作（未封装，整合框架）

//        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Session session=HibarnateUtil.getSession();
        //spring直接帮我们加载了hibernate.cgf.xml文件，
        // 让我们直接操作了sessionfactory。
//        SessionFactory factory=(SessionFactory)ac.getBean("sessionfactroy");
//        User nuser=(User)ac.getBean("user");
//        nuser.setUsername(username);
//        nuser.setPassword(password);
        //这里之后要封装为DAO
//        System.out.println(nuser.getUsername()+"  "+nuser.getPassword());
//        Session session = factory.openSession();
//        Transaction tr=session.beginTransaction();
//        String sql="select password from user where username=?";
//        Query query=session.createSQLQuery(sql);
//        query.setString(1,username);
//        List list=query.list();
//        if(list.isEmpty()){
//            System.out.println("用户名不存在");
//            return "error";
//        }
//        else {
//            System.out.println(list.get(0));
//            System.out.println(password);
//            if(list.get(0).equals(password)){
//                HttpServletResponse response = ServletActionContext.getResponse();
//                Cookie username = new Cookie("username", nuser.getUsername());
//                response.addCookie(username);
//                username.setMaxAge(-1);
//                return "success";
//            }else {
//                System.out.println("密码错误");
//                return "error";
//            }
//        }
//        if(username.equals(password)){
//            return "success";
//        }else {
//            return "error";
//        }
//        if(userService.login.hbm.xml(user)) {
//            Map session = ActionContext.getContext().getSession();
//            session.put("user", user);
//            return "success";
//        } else {
//            return "error";
//        }
