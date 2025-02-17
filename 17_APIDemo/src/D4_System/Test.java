package D4_System;

public class Test {
    public static void main(String[] args) {
        //JVMを中止する(推薦しない)
//        System.exit(0);

        //今のシステム時間を獲得する(ミリ秒を獲得し、1970-1-1 0:0:0から今までの総ミリ秒である。)
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 10000000; i++) {
            System.out.print(i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println("上記のforループが"+(time2-time)+"msをかかった。");
    }
}
