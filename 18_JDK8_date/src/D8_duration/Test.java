package D8_duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025, 11, 11, 11, 11, 10);
        LocalDateTime end = LocalDateTime.of(2025, 11, 11, 11, 11, 12);

        //durationオブジェクトを獲得する
        Duration duration = Duration.between(start, end);

        //二つの時間オブジェクト間隔の情報を獲得する
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
