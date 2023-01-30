package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ServletDemo6 extends MyHttpServlet {
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("GET。。。");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("POST。。。");
    }
}
