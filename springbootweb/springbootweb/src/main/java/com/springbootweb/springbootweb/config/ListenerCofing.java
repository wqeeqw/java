package com.springbootweb.springbootweb.config;

import com.springbootweb.springbootweb.listener.SecondListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
* listener配置类
* */

@Configuration
public class ListenerCofing {
    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean bean =new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }
}
