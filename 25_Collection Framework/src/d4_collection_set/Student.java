package d4_collection_set;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;

    public Student() {}

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
