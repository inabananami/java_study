package com.inabananami.a10threadsafe2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
           需求：
                  某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
                  利用同步方法完成
        */

        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "窗口1");
        Thread t2 = new Thread(mr, "窗口2");

        t1.start();
        t2.start();
    }
}
