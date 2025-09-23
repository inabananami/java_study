package com.inabananami.a04threadmethod1;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // 1. 创建线程对象
        MyThread t1 = new MyThread("台風");
        MyThread t2 = new MyThread("駐車場");

        // 2. 开启线程
        t1.start();
        t2.start();

        /*  细节：
                    当Jvm虚拟机启动之后，会自动地启动多条线程
                    其中有一条就是main线程
                    他的作用就是去调用main方法，并执行里面的代码
                    在以前，我们写的所有代码都运行在main线程当中
        */
        // 3. 获取当前线程的对象
//        Thread t = Thread.currentThread();
//        String name = t.getName();
//        System.out.println(name);

        //先打印1111，等5秒后打印2222
//        System.out.println("1111111111");
//        Thread.sleep(5000);
//        System.out.println("2222222222");
    }
}