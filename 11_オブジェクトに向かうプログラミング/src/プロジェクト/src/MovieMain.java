package プロジェクト.src;
import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
       Movie m = new Movie();
       Scanner scanner = new Scanner(System.in);
       int ID = 0;
       int flag = 1;
       m.GetInfo();
       System.out.println("do you want to search your prefer movie? if yes, press 1, if no, press 2: ");
       flag = scanner.nextInt();
       if(flag == 1) {
            System.out.println("please input your prefer movie: ");
            ID = scanner.nextInt();
            m.SearchById(ID);
       }
       scanner.close();
    }
}