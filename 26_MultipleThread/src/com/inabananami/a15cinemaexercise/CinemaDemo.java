package com.inabananami.a15cinemaexercise;

public class CinemaDemo {
    public static void main(String[] args) {
        //创建线程对象
        MyThread counter1 = new MyThread();
        MyThread counter2 = new MyThread();

        //修改线程名字
        counter1.setName("窗口1");
        counter2.setName("窗口2");

        //启动线程
        counter1.start();
        counter2.start();
    }
}