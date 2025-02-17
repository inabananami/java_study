package D1_jdk8_localDate;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //ローカル日付オブジェクトを獲得する
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        //日付オブジェクトの情報を獲得する
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();  //日
        int dayOfMonth = ld.getDayOfMonth();  //一年中の何日
        int dayOfWeek = ld.getDayOfWeek().getValue();  //何曜日
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println();
        System.out.println(dayOfYear);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        System.out.println();

        //直接的にある情報を直す：withYear、widthMonth、withDayOfMonth、withDayOfYear
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(11);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld);
        System.out.println();

        //ある情報をxxを足す
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(10);
        LocalDate ld6 = ld.plusDays(30);
        LocalDate ld7 = ld.plusWeeks(1);
        System.out.println(ld4);
        System.out.println(ld5);
        System.out.println(ld6);
        System.out.println(ld7);
        System.out.println();

        //指定された日付のLocalDateオブジェクトを獲得する
        LocalDate ld8 = LocalDate.of(2027, 07, 01);
        System.out.println(ld8);

        //二つの日付オブジェクトはイコールかどうか、前とか後ろとかを判断する。
        System.out.println(ld8.equals(ld7));
        System.out.println(ld8.isBefore(ld7));
        System.out.println(ld8.isAfter(ld7));
    }
}
