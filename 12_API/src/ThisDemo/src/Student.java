package ThisDemo.src;

public class Student {
    String name;
    String male;
    int point;
    public Student(String name, String male, int point) {
        //thisを加えなければ、変数の名称は衝突になる
        this.name = name;
        this.male = male;
        this.point = point;
    }
    public String GetName() {
        return name;
    }
}
