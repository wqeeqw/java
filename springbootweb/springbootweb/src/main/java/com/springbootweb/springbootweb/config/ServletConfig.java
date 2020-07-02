package com.springbootweb.springbootweb.config;

import com.springbootweb.springbootweb.servlet.SecondSerlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* servlet 配置类
*
*/

@Configuration

public class ServletConfig {
    /**
     * 完成servlet的注册
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondSerlet()); //实例化
        bean.addUrlMappings("/second");
        return bean;

    }

}
