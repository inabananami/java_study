package d2_regex;
import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("１を押すと、電話番号の確認機能です。\n２を押すと、メールの確認機能です。");
        int mode = sc.nextInt();
        switch(mode) {
            case 1:
                checkPhone();
                break;
            case 2:
                checkMail();
                break;
        }
    }
    public static void checkPhone() {
        while(true) {
            System.out.println("電話番号を入力してください：");
            Scanner scanner = new Scanner(System.in);
            String phone = scanner.next();

            if (phone.matches("(1[3-9]\\d{9})|(0\\d{2,4}-?[1-9]\\d{4,19})")) {
                System.out.println("ご入力の電話番号は正しいです。");
                break;
            }
            else {
                System.out.println("ご入力の電話番号は間違います。");
            }
        }
    }

    public static void checkMail() {
        while(true) {
            System.out.println("メールを入力してください：");
            Scanner scanner = new Scanner(System.in);
            String mail = scanner.next();

            if (mail.matches("\\w{2,}@\\w{2,20}\\.\\w{2,10}")) {
                System.out.println("ご入力のメールは正しいです。");
                break;
            }
            else {
                System.out.println("ご入力のメールは間違います。");
            }
        }
    }
}
