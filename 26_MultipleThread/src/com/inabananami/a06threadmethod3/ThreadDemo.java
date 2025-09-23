package com.inabananami.a06threadmethod3;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
               final void setDaemon(boolean on)   设置为守护线程
               细节：
                      当其他的非守护线程执行完毕之后，守护线程会陆续结束
        */

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.setName("idol");
        thread2.setName("fans");

        //把第二个线程设置为守护线程（备胎线程）
        thread2.setDaemon(true);

        //idol线程结束了，fans线程就陆续结束了（fans编号肯定小于100）
        thread1.start();
        thread2.start();
    }
}