package com.inabananami.a07threadmethod4;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            public static void yield()       出让线程/礼让线程
        */


        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("walker");
        t2.setName("car");

        t1.start();
        t2.start();
    }
}