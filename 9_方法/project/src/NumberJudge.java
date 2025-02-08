package project.src;

public class NumberJudge {
    public static void Judge(int num) {
        if(num == 0) {
            System.out.println(num+" 是偶数");
        }
        else if(num % 2 == 0) {
            System.out.println(num+" 是偶数");
        }
        else {
            System.out.println(num+" 是奇数");
        }
    }
    public static void main(String[] args) {
        int n = 137;
        Judge(n);
    }
}