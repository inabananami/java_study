package d1_polymorphism;

public class Student extends People {
    public String name = "Student";
    @Override
    public void run() {
        System.out.println("Student run fast~~");
    }
}