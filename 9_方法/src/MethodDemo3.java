public class MethodDemo3 {
    public static int IntPlus(int a, int b) {
        return a + b;
    }
    public static int IntPlus(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int a = 10,b = 10, c = 10;
        System.out.println(IntPlus(a, b));
        System.out.println(IntPlus(a, b, c));
    }
}
