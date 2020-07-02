package com.springbootweb.springbootweb.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondSerlet extends HttpServlet {
    public  void  doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Second Servlet...");
    }
}
