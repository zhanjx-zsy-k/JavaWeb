package com.atguigu.threadlocal;

/**
 * @author k
 * @create 2021-06-14 21:32
 */
public class OrderDao {
    public void saveOrder(){
        String name = Thread.currentThread().getName();
        System.out.println("OrderDao 当前线程【" + name + "】保存的数据是" + ThreadLocalTest.threadLocal.get());
    }
}
