package D7_Date;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //dateオブジェクトを作成して、現在のシステム時間を代表するものだ。
        Date date = new Date();
        System.out.println(date);

        //時間のミリ秒を獲得する
        long time = date.getTime();
        System.out.println(time);

        //時間のミリ秒値を日付オブジェクトに転換：2s後の時間はどう？
        time += 2 * 1000;
        Date date2 = new Date(time);
        System.out.println(date2);

        //直接に日付オブジェクトの時間をsetTime方法に通じて直す
        Date date3 = new Date();
        date3.setTime(time);
        System.out.println(date3);
    }
}