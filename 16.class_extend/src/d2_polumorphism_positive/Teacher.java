package d2_polumorphism_positive;

public class Teacher extends People {
    public String name = "Teacher";
    @Override
    public void run() {
        System.out.println("teacher run fast~~");
    }
    public void teach() {
        System.out.println("teaching");
    }
}