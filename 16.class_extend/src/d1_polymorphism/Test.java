package d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        //オブジェクトのポリモーフィズム
        People p1 = new Teacher();
        p1.run();  //行為のポリモーフィズム
        System.out.println(p1.name);

        People p2 = new Student();
        p2.run();
        System.out.println(p2.name);
    }
}