package com.inabananami.a13waitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        *
        *       需求：完成生产者和消费者（等待唤醒机制）的代码
        *               实现线程轮流交替执行的效果
        *
        *
        * */

        //创建线程对象
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        //给线程设置名字
        cook.setName("厨师");
        foodie.setName("吃货");

        //启动线程
        cook.start();
        foodie.start();
    }
}
