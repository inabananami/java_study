package D5_JDK8_Instant;
import java.time.Instant;

public class Test {
    public static void main(String[] args) {
        //Instantオブジェクトを作成し、今の時間情報を獲得する
        Instant now = Instant.now();

        //総秒数を獲得する
        long second = now.getEpochSecond();
        System.out.println(second);

        //一秒を足りないのナノ秒数
        int nano = now.getNano();
        System.out.println(nano);
        System.out.println(now);
    }
}