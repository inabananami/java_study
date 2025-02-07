public class While {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while(a <= 5) {
            System.out.printf("%d ",a);
            a++;
        }
        do {
            System.out.printf("%d ", b);
            b++;
        }while(b<=5);
    }
}
