package D8_interface_project;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int flag = 1;
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        while(flag != 0) {
            System.out.println("输入1为功能1，输入2为功能2，输入0退出程序");
            flag = scanner.nextInt();
            switch (flag) {
                case 1:
                    student.printAll();
                    student.printAverage();
                    break;
                case 2:
                    student.printAll2();
                    student.printAverage2();
            }
        }
    }
}