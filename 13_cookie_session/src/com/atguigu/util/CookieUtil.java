package com.atguigu.util;

import javax.servlet.http.Cookie;

/**
 * @author k
 * @create 2021-06-11 21:46
 */
public class CookieUtil {
    public static Cookie findCookie(String name, Cookie[] cookies) {
        if (name == null || cookies == null || cookies.length == 0) {
            return null;
        }

        for (Cookie cookie : cookies) {
            if (name.equals(cookie.getName())) {
                return cookie;
            }
        }

        return null;
    }
}
