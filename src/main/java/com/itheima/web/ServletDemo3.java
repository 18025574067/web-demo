package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * servlet 方法介绍
 */
@WebServlet(urlPatterns = "/demo3", loadOnStartup = 1)
public class ServletDemo3 implements Servlet {
    private ServletConfig config;

    /**
     * 初始化方法
     * 1. 调用时机：默认情况下，Servlet第一次被访问时，会被调用
     * * loadOnStartup: -1表示是默认情况，第一次被访问时，才会被调用。
     * *               0 或者是 正整数 代表服务器开启就调用了。
     * 2. 调用次数：1次。
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
        System.out.println("init... ...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    /**
     * 提供服务：
     * 1. 调用时机：每一次servlet被访问时，调用
     * 2. 调用次数：多次。
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~~");
    }

    /**
     * 销毁方法：
     * 1. 调用时机：内存释放或者服务器关闭的时候，Servlet对象会被销毁时调用。
     * 2. 调用次数：1次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public String getServletInfo() {
        return "";
    }
}
