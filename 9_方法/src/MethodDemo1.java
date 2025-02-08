public class MethodDemo1 {
    public static int Plus(int i, int j) {
        return i + j;
    }
    public static void main(String[] args) {
        int i = 4, j = 1;
        Plus(i, j);
        System.out.println(Plus(i, j));
    }
}
