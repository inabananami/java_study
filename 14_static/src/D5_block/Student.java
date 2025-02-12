package D5_block;

public class Student {
    static int num = 80;
    static String schoolName;

    //staticコードブロック
    static {
        System.out.println("staticブロックが実行された～～");
        schoolName = "黑马";
    }
    {
        System.out.println("実例ブロックが実行された～～");
        System.out.println("誰かがオブジェクトを作った "+this);
    }

    public Student() {
        System.out.println("test1");

    }
    public Student(String name) {
        System.out.println(name);
    }
}