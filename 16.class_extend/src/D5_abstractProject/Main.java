package D5_abstractProject;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("wangcai");
        Cat c = new Cat("miaomiao");

        d.GetName();
        d.Voice();
        System.out.println();
        c.GetName();
        c.Voice();
    }
}
