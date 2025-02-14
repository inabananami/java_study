package d4_abstract;

public abstract class A {
    private String name;
    public static String schoolName;

    public A() {
        name = "1";
    }

    public A(String name) {
        this.name = name;
    }
    //抽象方法：必ずabstractで修飾し、方法スローガンだけであり、方法体は絶対にないにする
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}