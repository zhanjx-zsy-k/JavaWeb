package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author k
 * @create 2021-05-31 1:08
 */
public class UserDaoImplTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() {

        if((userDao.queryUserByUsername("admin"))==null){
            System.out.println("用户名可用！");
        }else {
            System.out.println("用户已存在！");
        }
    }

    @Test
    public void saveUser() {

        System.out.println(userDao.saveUser(new User(null,"zjx123","123456","123456@qq.com")));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if((userDao.queryUserByUsernameAndPassword("admin","admi2n"))==null){
            System.out.println("用户名或密码错误，登录失败");
        }else {
            System.out.println("查询成功");
        }
    }


}