import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        int level;
        double price;
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your price of the flight ticket: ");
        price = scanner.nextDouble();
        System.out.println("please input your level of the flight, 0 is economy; 1 is premium");
        level = scanner.nextInt();
        System.out.println("please input the month you buy: ");
        month = scanner.nextInt();
        while(level != 1 && level != 0) {
            System.out.println("error occured! please input the level again: ");
            level = scanner.nextInt();
        }
        while (month >12 && month < 0) {
            System.out.println("error occured! please input the month again: ");
            month = scanner.nextInt();
        }
        if(month >= 5 && month <=10) {
            if(level == 0) {
                System.out.printf("the price of your economy flight ticket is: %.2f\n", price * 0.85);
            }
            else if(level == 1) {
                System.out.printf("the price of your premium flight ticket is: %.2f\n", price * 0.9);
            }
        }
        else {
            if(level == 0) {
                System.out.printf("the price of your economy flight ticket is: %.2f\n", price * 0.65);
            }
            else if(level == 1) {
                System.out.printf("the price of your premium flight ticket is: %.2f\n", price * 0.7);
            }
        }
        scanner.close();
    }
}
