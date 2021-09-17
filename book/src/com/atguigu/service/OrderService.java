package com.atguigu.service;

import com.atguigu.pojo.Cart;

/**
 * @author k
 * @create 2021-06-13 2:03
 */
public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
