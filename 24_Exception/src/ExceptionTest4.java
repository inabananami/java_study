import java.util.Scanner;

public class ExceptionTest4 {
    public static void main(String[] args) {
        //修復してみる
        while(true) {
            //方法を使用し、ユーザーに返すまで適当な価格を入力させる。
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("ご入力の価格は合法ではありませんでした、数字を入力してください");
            }
        }
    }

    public static double getMoney() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("手頃な価格を入力してください：");
            double money = sc.nextDouble();
            if (money >= 0) {
                return money;
            }else {
                System.out.println("ご入力の価格は会いませんでした");
            }
        }
    }
}