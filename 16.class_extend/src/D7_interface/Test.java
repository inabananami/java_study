package D7_interface;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.schoolName);

        //オブジェクトを作成できない
        //A a = new A();

        Union union = new Union();
        union.Test();
        union.TestB1();
        union.TestB2();
        union.TestC1();
        union.TestC2();
    }
}