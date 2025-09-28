package com.inabananami.a21threadsource;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
            public static ExecutorService newCachedThreadPool()    创建一个没有上限的线程池
            public static ExecutorService new FixedThreadPool(int nThreads)  创建有上限的线程池
        */

        //创建线程池对象
//      ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        //提交任务
        pool1.submit(new MyRunnable());

        Thread.sleep(1000);

        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());

        //销毁线程池
//        pool1.shutdown();
    }
}