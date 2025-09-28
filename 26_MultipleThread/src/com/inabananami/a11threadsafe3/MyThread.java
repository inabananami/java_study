package com.inabananami.a11threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    //表示这个类所有的对象，都共享ticket数据
    //可能导致票数超出范围
    static int ticket = 0;  //0~99
    //biaoshif
    static Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            //上锁
            try {
                lock.lock();
                if (ticket == 1000) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }
            } catch (InterruptedException e) {
                    e.printStackTrace();
            } finally {
                //解锁
                lock.unlock();
            }
        }
    }
}