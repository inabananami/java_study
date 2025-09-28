package com.inabananami.a18redpacketexe;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread p1 = new MyThread();
        MyThread p2 = new MyThread();
        MyThread p3 = new MyThread();
        MyThread p4 = new MyThread();

        p1.setName("person one");
        p2.setName("person two");
        p3.setName("person three");
        p4.setName("person four");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}