package com.inabananami.a15cinemaexercise;

public class MyThread extends Thread {

    static int ticket = 1000;
    static boolean isSoldOut = false;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket > 0) {
                    System.out.println(getName() + "交易成功，还剩" + ticket + "张票");
                    ticket--;
                } else {
                    if (!isSoldOut) {
                        System.out.println("票已售罄！");
                        isSoldOut = true;
                    }
                    break;
                }
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}