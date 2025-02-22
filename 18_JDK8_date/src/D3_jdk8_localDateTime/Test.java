package D3_jdk8_localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //日付と時間の全部の情報を獲得できる
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int dayOfYear = ldt.getDayOfYear();
        int dayOfWeek = ldt.getDayOfWeek().getValue();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        int nano = ldt.getNano();

        //時間情報を直す
        LocalDateTime ldt2 = ldt.withYear(2027);
        LocalDateTime ldt3 = ldt.withMinute(30);

        //いくらを足す
        LocalDateTime ldt4 = ldt.plusYears(2);
        LocalDateTime ldt5 = ldt.plusMonths(3);

        //いくらを経る
        LocalDateTime ldt6 = ldt.minusDays(4);
        LocalDateTime ldt7 = ldt.minusYears(5);

        //指定された日付と時間のLocalDateTimeオブジェクトを獲得する
        LocalDateTime ldt8 = LocalDateTime.of(2027, 07, 01, 12, 12, 12, 122);

        //二つの時間オブジェクトはイコールかどうか、前とか後ろとかを判断する。
        System.out.println(ldt8.equals(ldt7));
        System.out.println(ldt8.isAfter(ldt7));
        System.out.println(ldt8.isBefore(ldt7));

        //LocalDateTimeをLocalDateとLocalTimeを転換できる
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
    }
}