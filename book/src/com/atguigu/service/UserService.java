package com.atguigu.service;

import com.atguigu.pojo.User;

/**
 * @author k
 * @create 2021-05-31 1:16
 */
public interface UserService {


    public void registUser(User user);

    public User login(User user);

    public boolean existsUsername(String username);


}
