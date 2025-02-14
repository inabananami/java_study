package d1_polymorphism;

public class Teacher extends People {
    public String name = "Teacher";
    @Override
    public void run() {
        System.out.println("teacher run fast~~");
    }
}