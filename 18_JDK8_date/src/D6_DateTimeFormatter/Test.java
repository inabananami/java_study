package D6_DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        //DateTimeFormatterオブジェクトを作成する
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        //時間をフォーマットにさせる
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        String format = formatter.format(ldt);
        System.out.println(format);

        //もう一つの方案である
        String format2 = ldt.format(formatter);
        System.out.println(format2);

        //時間を解析する：時間の解析は一般的にLocalDateTimeが提供する解析方法を使用して解析することである。
        String dateStr = "2029年12月12日 12:12:12";
        LocalDateTime date = LocalDateTime.parse(dateStr, formatter);
        System.out.println(date);
    }
}

