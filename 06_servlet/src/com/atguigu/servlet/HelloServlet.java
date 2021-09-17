package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author k
 * @create 2021-05-28 22:07
 */
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1.构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化方法");
        System.out.println(servletConfig.getServletName());
        System.out.println(servletConfig.getInitParameter("username"));
        System.out.println(servletConfig.getInitParameter("url"));
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        String method = httpServletRequest.getMethod();
//        System.out.println(method);

        if("GET".equals(method)){
//            System.out.println("GET请求");
                    doGet();
        }else if("POST".equals(method)){
//            System.out.println("POST请求");
            doPost();
        }
//        System.out.println("3.service方法 === HelloServlet被访问了");
    }

    public void doGet(){
        System.out.println("POST请求");System.out.println("POST请求");
    }

    public void doPost(){
        System.out.println("POST请求");System.out.println("POST请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.销毁方法");
    }
}
