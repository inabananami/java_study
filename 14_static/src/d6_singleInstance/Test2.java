package d6_singleInstance;

public class Test2 {
    public static void main(String[] args) {
        B b = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b == b2);
    }
}