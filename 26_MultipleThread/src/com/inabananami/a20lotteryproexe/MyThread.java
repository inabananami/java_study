package com.inabananami.a20lotteryproexe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyThread extends Thread {
    //原奖池集合
    ArrayList<Integer> originalSource;
    //奖池记录
    List<Integer> lotterySource;

    //构造函数，传入测试类的集合。
    MyThread(ArrayList<Integer> originalSource, ArrayList<Integer> lotterySource) {
        this.originalSource = originalSource;
        this.lotterySource = lotterySource;
    }
    @Override
    public void run() {
        //随机生成一个下标
        Random r = new Random();
        while(true){
            int lotteryPrize;
            synchronized (MyThread.class){
                if(originalSource.isEmpty()) break;
                else {
                    int index = r.nextInt(originalSource.size());
                    lotteryPrize = originalSource.remove(index);
                }
            }
            //保存至各个奖池的集合中
            lotterySource.add(lotteryPrize);
            //睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
