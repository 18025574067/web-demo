package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ServletDemo5 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 根据请求方式不同，进行不同的处理。

        HttpServletRequest request = (HttpServletRequest) req;
        // 1. 获取请求方式
        String method = request.getMethod();

        // 2. 判断
        if ("GET".equals(method)){
            // get方式的处理逻辑
            System.out.println("GET。。。");
        }else if ("POST".equals(method)){
            // post方式的处理逻辑
            System.out.println("POST。。。");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
