//まずはAPIを導入する
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //方法を宣言する
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("please input a number:");        
        a = scanner.nextInt();
        System.out.println("the nume your input is:"+a);
        scanner.close();
    }   
}
