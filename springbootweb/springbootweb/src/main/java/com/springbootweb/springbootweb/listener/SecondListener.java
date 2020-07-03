package com.springbootweb.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
//整合listener 方式二

public class SecondListener implements ServletContextListener {
    public  void  contextDestroyed(ServletContextEvent event){

    }
    public void contextInitialized(ServletContextEvent event){
        System.out.println("Second...Listener ....init ....");
    }
}
