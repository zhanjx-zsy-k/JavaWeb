package com.atguigu.threadlocal;

/**
 * @author k
 * @create 2021-06-14 21:29
 */
public class OrderService {
    public void createOrder() {
        String name = Thread.currentThread().getName();
        System.out.println("OrderService 当前线程【" + name + "】保存的数据是" + ThreadLocalTest.threadLocal.get());
        new OrderDao().saveOrder();
    }
}
