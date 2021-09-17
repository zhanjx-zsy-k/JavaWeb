package com.atguigu.threadlocal;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

/**
 * @author k
 * @create 2021-06-14 21:23
 */
public class ThreadLocalTest {
//    public final static Map<String, Object> data = new Hashtable<>();
    public static ThreadLocal<Object> threadLocal = new ThreadLocal<>();
    private static Random random = new Random();


    public static class Task implements Runnable {

        @Override
        public void run() {
            int i = random.nextInt(1000);

            String name = Thread.currentThread().getName();

            System.out.println("线程【" + name + "】生成的随机数是" + i);
//            data.put(name, i);
            threadLocal.set(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            new OrderService().createOrder();

//            Object o = data.get(name);

            Object o = threadLocal.get();

            System.out.println("在线程【" + name + "】快结束时取出关联的数据是：" + o);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Task()).start();
        }
    }

}
