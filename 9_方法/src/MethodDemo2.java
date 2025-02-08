public class MethodDemo2 {
    public static void change(int a) {
        System.out.println(a);
        //このaは局部的な変数です
        a = 20;
        System.out.println(a);
    }
    public static void change2(int[] arr) {
        System.out.println(arr[1]);
        arr[1] = 333;
        System.out.println(arr[1]);
    }
    public static void main(String[] args) {
        // int a = 10;
        // change(a);
        //なので、このaはmain方法のaになったり、出力は10 20 10になったりします。
        // System.out.println(a);

        int[] arr = new int[]{1,2,4};
        change2(arr);
        System.out.println(arr[1]);
    }
}