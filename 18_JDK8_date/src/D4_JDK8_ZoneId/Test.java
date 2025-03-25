package D4_JDK8_ZoneId;
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //システムディフォルトの時間帯を獲得する
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());

        //javaがサポートしているすべての時間帯を獲得する
        System.out.println(zoneId.getAvailableZoneIds());

        //ある時間帯idをZoneIdオブジェクトをカプセル化にする
        ZoneId zoneId1 = ZoneId.of("Japan");
        System.out.println(zoneId1.getId());

        //時間帯をつけている時間
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        //世界標準時を獲得する
        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);

        //システムディフォルトの時間帯のZonedDateTimeオブジェクトを獲得する
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

        //Calenderも時間帯を獲得できる
        System.out.println();
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId1));
        System.out.println(instance);
    }
}