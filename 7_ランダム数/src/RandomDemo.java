import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        //0から9まで出力する
        int num = r.nextInt(10) + 1;
        System.out.println(num);
    }
}