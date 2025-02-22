package D8_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    //エラーが発生させないため、throws ParseExceptionを導入するべきだ
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        //DateからSimpleDateFormatまで転換する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rs = sdf.format(date);
        String rs2 = sdf.format(time);
        System.out.println(rs);
        System.out.println(rs2);
        System.out.println("-----------------------------------------------------------");

        //SimpleDateFormatからDateまで転換する、sdfのフォーマットは必ず同じ
        String dateStr = "2022-12-12 12:12:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = null;
        date2 = sdf2.parse(dateStr);
        System.out.println(date2);
    }
}
