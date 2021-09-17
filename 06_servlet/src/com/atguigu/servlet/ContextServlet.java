package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author k
 * @create 2021-05-28 23:41
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletConfig().getServletContext();
        System.out.println(context.getInitParameter("username"));
        System.out.println(context.getInitParameter("password"));

        System.out.println(context.getContextPath());

        System.out.println(context.getRealPath("/"));
        System.out.println(context.getRealPath("/css"));
        System.out.println(context.getRealPath("/imgs/3.jpg"));
    }
}
