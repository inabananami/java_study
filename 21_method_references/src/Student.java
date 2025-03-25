public class Student implements Comparable<Student> {
    private String name;
    private double height;
    private int age;

    public Student() {}

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() { return name; };
    public void setName(String name) { this.name = name; }

    public double getHeight() { return height; };
    public void setHeight(double height) { this.height = height; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    //this o
    @Override
    public int compareTo(Student o) {
        //約束１：左のオブジェクトは右のものより大きい　正整数を返してください
        //約束２：左のオブジェクトは右のものより小さい　負整数を返してください
        //約束３：左のオブジェクト＝右のもの　０を返してください
//        if(this.age > o.age) {
//            return 1;
//        } else if(this.age < o.age) {
//            return -1;
//        }
//        return 0;

        return this.age - o.age;
    }

    @Override
    public String toString() {
        return name + " (" + age + "歳, " + height + "cm)";
    }
}