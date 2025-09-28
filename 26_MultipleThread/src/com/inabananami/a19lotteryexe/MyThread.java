package com.inabananami.a19lotteryexe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyThread extends Thread{

    ArrayList<Integer> list;
    static boolean isEmpty = false;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(list.size()==0){
                    if(!isEmpty){
                        System.out.println("所有奖项已抽完");
                        isEmpty = true;
                    }
                    break;
                } else {
                    Random r = new Random();
                    int index = r.nextInt(list.size());
                    System.out.println(getName() + "产生了" + list.get(index) + "元奖金");
                    list.remove(index);
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
