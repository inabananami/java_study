package com.inabananami.a16presentexercise;

public class MyThread extends Thread {

    static int present = 10000;
    static boolean isPresentOver = false;

    @Override
    public void run() {
        Long timeMillis1 = System.currentTimeMillis();
        while (true) {
            synchronized (MyThread.class) {
                if (present < 10) {
                    if (!isPresentOver) {
                        Long timeMillis2 = System.currentTimeMillis();
                        System.out.println("礼物不能再被送出");
                        isPresentOver = true;
                        System.out.println("用了" + (timeMillis2 - timeMillis1) + "毫秒");
                    }
                    break;
                } else {
                    present--;
                    System.out.println(getName() + "正在送出礼物，" + "还剩"+ present + "个礼物");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
