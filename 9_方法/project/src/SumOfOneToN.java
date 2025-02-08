package project.src;

public class SumOfOneToN {
    public static int Sum(int end) {
        int sum = 0;
        for(int i = 1; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 100;
        int sum = Sum(n);
        System.out.println(sum); 
    }
}
