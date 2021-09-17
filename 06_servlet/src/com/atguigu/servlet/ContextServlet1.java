package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author k
 * @create 2021-05-29 0:04
 */
public class ContextServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        System.out.println("保存前"+context.getAttribute("k1"));

        context.setAttribute("k1","v1");
        System.out.println(context.getAttribute("k1"));
        System.out.println(context.getAttribute("k1"));
        System.out.println(context.getAttribute("k1"));
        System.out.println(context.getAttribute("k1"));
        System.out.println(context.getAttribute("k1"));
    }
}
