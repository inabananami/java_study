package D6_BigDecimal;
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //BigDecimalを使って精確計算方法を身につく
        double a = 0.1;
        double b = 0.2;

        //お先にdouble型データをBigDemicalオブジェクトにして、計算を参加する
        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);

        //足す
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);

        //減る
        BigDecimal c2 = a1.subtract(b1);
        System.out.println(c2);

        //かける
        BigDecimal c3 = a1.multiply(b1);
        System.out.println(c3);

        //割り
        BigDecimal c4 = a1.divide(b1);
        System.out.println(c4);

        //割り、何位まで精確にする
        BigDecimal c5 = BigDecimal.valueOf(11.1);
        BigDecimal c6 = BigDecimal.valueOf(1.1);
        BigDecimal c7 = c5.divide(c6, 3, BigDecimal.ROUND_HALF_UP);
        System.out.println(c7);

        //BigDecimalオブジェクトをdoubleに転換する
        double db1 = c5.doubleValue();
        double db2 = c6.doubleValue();
        print(db1);
        print(db2);
    }
    public static void print(double a) {
        System.out.println(a);
    }
}