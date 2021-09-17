package com.atguigu.dao;

import com.atguigu.pojo.User;

/**
 * @author k
 * @create 2021-05-31 0:56
 */
public interface UserDao {


    public User queryUserByUsername(String username);

    public int saveUser(User user);

    public User queryUserByUsernameAndPassword(String username,String password);
}
