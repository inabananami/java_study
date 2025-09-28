package com.inabananami.a18redpacketexe;

import java.util.Random;

public class MyThread extends Thread {

    static double money = 100;
    static int packet = 3;
    static boolean isFinished = false;

    static final double MIN = 0.01;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (packet == 0) {
                    if (!isFinished) {
                        System.out.println(getName() + "没有抢到红包");
                        isFinished = true;
                    }
                    break;
                } else {
                    //开始抽奖
                    double upperbound = money - (packet - 1) * MIN;
                    double cash;
                    //不能直接随机
                    if (packet == 1) {
                        //最后一个红包
                        //无需随机，直接是全部剩余金额
                        cash = money;
                        packet--;
                    } else {
                        Random r = new Random();
                        cash = Math.max(r.nextDouble(upperbound), MIN);
                        money -= cash;
                        packet--;
                    }
                    System.out.println(getName() + "抢到了" + cash + "元");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
