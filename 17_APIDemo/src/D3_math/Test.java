package D3_math;

public class Test {
    public static void main(String[] args) {
        //絶対値を取る
        System.out.println(Math.abs(-11));
        System.out.println(Math.abs(146));
        System.out.println(Math.abs(-3.1415));

        //上を向けて整数を取る
        System.out.println(Math.ceil(2.2));
        System.out.println(Math.ceil(146.7));

        //下を向けて整数を取る
        System.out.println(Math.floor(2.2));
        System.out.println(Math.floor(146.7));

        //四捨五入する
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(146.4));

        //最大値と最小値を取る
        System.out.println(Math.max(146, 147));
        System.out.println(Math.min(227, 228));

        //ｎのｍ乗を取る
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, 10));

        //ランダム数を取る
        System.out.println(Math.random());
    }
}
