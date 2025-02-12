package D2StaticMethod;

public class Student {
    double score;
    //クラス方法
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    //実例方法
    public void printPass() {
        System.out.println("score: "+(score >= 60 ? "pass": "fail"));
    }
}