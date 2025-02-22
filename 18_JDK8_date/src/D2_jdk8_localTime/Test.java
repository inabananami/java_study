package D2_jdk8_localTime;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        //時間の情報を獲得する
        int hour = lt.getHour();
        int minute = lt.getMinute();
        int second = lt.getSecond();
        int nano = lt.getNano();
        System.out.print(hour+":"+minute+":"+second+":"+nano+"\n");
        System.out.println();

        //時間を直す
        LocalTime lt2 = lt.withHour(10);
        LocalTime lt3 = lt.withMinute(10);
        LocalTime lt4 = lt.withSecond(10);
        LocalTime lt5 = lt.withNano(10);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);
        System.out.println(lt5);
        System.out.println();

        //いくらを足す
        LocalTime lt6 = lt.plusHours(10);
        LocalTime lt7 = lt.plusMinutes(10);
        LocalTime lt8 = lt.plusSeconds(10);
        LocalTime lt9 = lt.plusNanos(10);

        //いくらを減る
        LocalTime lt10 = lt.minusHours(10);
        LocalTime lt11 = lt.minusMinutes(10);
        LocalTime lt12 = lt.minusSeconds(10);
        LocalTime lt13 = lt.minusNanos(10);

        //指定された時間のオブジェクトを獲得する
        LocalTime lt14 = LocalTime.of(12, 12, 14);
        System.out.println(lt14);
        System.out.println();

        //二つの時間オブジェクトはイコールかどうか、前とか後ろとかを判断する。
        System.out.println(lt13.equals(lt14));
        System.out.println(lt13.isAfter(lt14));
        System.out.println(lt13.isBefore(lt14));
    }
}
