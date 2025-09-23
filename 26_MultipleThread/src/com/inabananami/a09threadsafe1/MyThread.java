package com.inabananami.a09threadsafe1;

public class MyThread extends Thread {

    //表示这个类所有的对象，都共享ticket数据
    //可能导致票数超出范围
    static int ticket = 0;  //0~99

    @Override
    public void run() {
        while (true) {
            if (ticket < 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket++;
                System.out.println(getName() + "正在卖第" + ticket + "张票");
            } else {
                break;
            }
        }
    }
}