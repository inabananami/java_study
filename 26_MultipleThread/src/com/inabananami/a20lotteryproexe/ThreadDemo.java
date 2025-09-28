package com.inabananami.a20lotteryproexe;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        //抽奖箱1奖池记录
        ArrayList<Integer> lotterySource1 = new ArrayList<>();
        //抽奖箱2奖池记录
        ArrayList<Integer> lotterySource2 = new ArrayList<>();

        MyThread t1 = new MyThread(list, lotterySource1);
        MyThread t2 = new MyThread(list, lotterySource2);

        t1.setName("奖池1");
        t2.setName("奖池2");

        t1.start();
        t2.start();

        //等待两个线程都执行完（必须）
        t1.join();
        t2.join();

        format(lotterySource1,"奖池1");
        format(lotterySource2, "奖池2");
        System.out.println("所有奖项已抽完");
    }

    private static void format(ArrayList<Integer> list, String threadName) {
        int size = list.size();
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("在此次抽奖过程中，"+threadName+"总共产生了"+size+"个奖项。");
        System.out.println("分别为："+list+"。");
        System.out.println("最高奖项为"+max+"元");
        System.out.print("总计额为"+sum+"元");
        System.out.println("\n");
    }
}