package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author k
 * @create 2021-05-31 1:22
 */
public class UserServiceImplTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null,"bbj168","6666666","bbj@qq.com"));
        userService.registUser(new User(null,"abc168","6666666","abc@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"zjx123","123456",null)));
    }

    @Test
    public void existsUsername() {
        if(userService.existsUsername("zjxx123")){
            System.out.println("用户名已存在");
        }else {
            System.out.println("用户名可用");
        }

    }
}