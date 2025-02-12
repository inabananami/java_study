package d6_singleInstance;

public class A {
    private static A a = new A();

    //1. Aの構造器を必ずプライベートにする
    private A() {
        int num = 1;
    }

    //2. 一つのクラス方法を宣言して、クラスのオブジェクトを返す
    public static A getObject() {
        return a;
    }
}