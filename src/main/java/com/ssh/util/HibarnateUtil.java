package com.ssh.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//不用spring注入时可以用这个工具类
public class HibarnateUtil {
    private static Configuration conf=new Configuration().configure() ;
    private static SessionFactory factory=conf.buildSessionFactory();
    public static Session getSession(){
        return factory.openSession();
    }
}
