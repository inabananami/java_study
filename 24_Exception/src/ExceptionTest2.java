import java.util.Scanner;

public class ExceptionTest2 {
    public static void main(String[] args) {
        //欲求：合法的な年齢を保存する
        try {
            saveAge(223);
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("バッグがある！！！");
        }
    }
    public static void saveAge(int age) {
        if (age>0 && age<150) {
            System.out.println("ご入力の年齢を保存しました　" + age);
        }
        else {
            //異常クラスを使ってこの問題をカプセル化にして投げ出す
            throw new AgeIllgalRuntimeException("The age is illegal, your age is " + age);
        }
    }
}