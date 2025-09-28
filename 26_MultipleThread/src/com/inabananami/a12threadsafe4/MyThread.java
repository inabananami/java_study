package com.inabananami.a12threadsafe4;

public class MyThread extends Thread {
    static Object objA = new Object();
    static Object objB = new Object();

    //避免死锁的方法：不能让两个锁嵌套起来
    @Override
    public void run() {
        //循环
        while (true) {
            if ("线程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("线程A拿到了A锁");
                    synchronized (objB) {
                        System.out.println("线程A拿到了B锁，顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                    if ("线程B".equals(getName())) {
                        synchronized (objB) {
                            System.out.println("线程B拿到了B锁，准备拿A锁");
                            synchronized (objA) {
                                System.out.println("线程B拿到了A锁，顺利执行完一轮");
                            }
                        }
                    }
                }
        }
    }
}