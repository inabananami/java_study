public class Triangle_2 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int k = 5 - i; k >= 0; k-- ) {
                System.err.print(" ");
            }
            for(int j = 1; j <= 2 * i + 1; j++) {
                System.err.print("*");
            }
            System.out.println();
        }
    }
}