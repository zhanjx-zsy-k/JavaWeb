package com.atguigu.servlet;

import com.atguigu.util.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author k
 * @create 2021-06-11 21:19
 */
public class CookieServlet extends BaseServlet {
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie cookie = new Cookie("key1","newValue1");
//        resp.addCookie(cookie);
//        resp.getWriter().write("key1cookie已經修改");


        Cookie cookie = CookieUtil.findCookie("key2",req.getCookies());
        if (cookie!=null) {
            cookie.setValue("newValue2");
            resp.addCookie(cookie);
            resp.getWriter().write("key2cookie已經修改");
        }
    }

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key2", "value2");

        resp.addCookie(cookie);
        Cookie cookie2 = new Cookie("key3", "value3");

        resp.addCookie(cookie2);


        resp.getWriter().write("Cookie创建成功");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (int i = 0; i < cookies.length; i++) {

            resp.getWriter().write("[" + cookies[i].getName() + ":" + cookies[i].getValue() + "]" + "<br/>");
        }

        Cookie icookie = CookieUtil.findCookie("key2", cookies);

        if (icookie != null) {
            resp.getWriter().write("找到了需要的COokie");
        }


    }
}
