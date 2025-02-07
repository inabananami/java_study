import java.util.Scanner;

public class DeadLoop {
    public static void main(String[] args) {
        // for(int i = 0;; i++) {
        //     System.out.println(i);
        // }
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        while(flag == 1) {
            System.out.println("1.存钱 2.取钱 3.查看余额 4.按0退出程序");
            flag = scanner.nextInt();
        }
        scanner.close();
    }
}
