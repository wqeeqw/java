package com.springbootweb.springbootweb.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
*
* 整合servlet 方式一
*
*/
@WebServlet(name = "FirstServlet",urlPatterns = "/first")

public class FirstServlet extends HttpServlet{
     public  void  doGet(HttpServletRequest request, HttpServletResponse response){
         System.out.println("First Servlet...");
     }
}
