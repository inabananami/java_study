package com.inabananami.a05threadmethod2;

public class ThreadDemo {
    public static void main(String[] args) {
        // 创建线程要执行的参数对象
        MyRunable mr = new MyRunable();
        // 创建线程对象
        Thread t1 = new Thread(mr, "アイドル");
        Thread t2 = new Thread(mr, "バンド");

        //默认值是5
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());

        //main线程的优先级也是5
//        System.out.println(Thread.currentThread().getPriority());

        //设置t1的优先级为1，t2的为10
        //但是只会增加t2的运行几率
        t1.setPriority(1);
        t2.setPriority(10);
        t2.start();
        t1.start();
    }
}