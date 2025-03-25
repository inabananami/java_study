package D10_Calender;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //システムの時間に対する日付オブジェクトを獲得する
        Calendar now = Calendar.getInstance();
        System.out.println(now);
        System.out.println();

        //日付のある情報を獲得する
        int year = now.get(Calendar.YEAR);
        System.out.println(year);
        int month = now.get(Calendar.MONTH);
        System.out.println(month);
        int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
        System.out.println();

        //Dateオブジェクトを獲得する
        Date d = now.getTime();
        System.out.println(d);
        System.out.println();

        //時間のミリ秒データを獲得する
        long time = now.getTimeInMillis();
        System.out.println(time);
        System.out.println();

        //Calenderのある情報を直す(Calender.MONTHの実際データは、０から始まるものだ)
        now.set(Calendar.MONTH, 3);
        System.out.println(now.get(Calendar.MONTH));
        System.out.println();

        //Calenderのある情報を足す、割る
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
        now.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
        now.add(Calendar.DAY_OF_YEAR, -100);
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
    }
}
