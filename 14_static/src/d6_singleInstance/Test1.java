package d6_singleInstance;

public class Test1 {
    public static void main(String[] args) {
        A a1 = A.getObject();
        A a2 = A.getObject();
        //アドレスは同じ
        System.out.println(a1);
        System.out.println(a2);
    }
}