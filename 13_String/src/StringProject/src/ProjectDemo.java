package StringProject.src;
import java.util.Scanner;

public class ProjectDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String TrueAcc = "itheima";
        String TruePas = "123456";
        int count = 0;
        System.out.println("-------------------------------------------------");
        System.out.println("--------------welcome to our site! --------------");
            System.out.println("please input your account: ");
            String account = scanner.nextLine();
            System.out.println("please input your password: ");
            String password = scanner.nextLine();
            if(TrueAcc.equals(account) && TruePas.equals(password)) {
                System.out.println("login successed!");
            }
            while(!TruePas.equals(password)|| !TrueAcc.equals(account)) {
                System.out.println("your password or account is false");
                count++;
                System.out.println("you have "+count+" times to input");
                System.out.println("please input your account: ");
                account = scanner.nextLine();
                System.out.println("please input your password: ");
                password = scanner.nextLine();
                if(TrueAcc.equals(account) && TruePas.equals(password)) {
                    System.out.println("login successed!");
                    break;
                }
                if(count == 3) {
                    System.out.println("three times' appointment is over!");
                    break;
                }
            }
        scanner.close();
    }
}