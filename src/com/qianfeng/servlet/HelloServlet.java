package com.qianfeng.servlet;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "HelloServlet")
public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("haha");
        response.getWriter().write("hello world");
        response.setContentType("text/html;charset=utf-8");
    }
}
