package D7_interface;

public class Union implements A, B, C {
    @Override
    public void Test(){
        System.out.println("printA");
    }
    public void TestB1() {
        System.out.println("printB1");
    }
    public void TestB2() {
        System.out.println("printB2");
    }
    public void TestC1() {
        System.out.println("printC1");
    }
    public void TestC2() {
        System.out.println("printC2");
    }
}
