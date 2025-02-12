package D5_block;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.num);
        System.out.println(Student.schoolName);

        System.out.println("--------------------------------------------");
        Student s1 = new Student();
        Student s2 = new Student("佐藤さん");
    }
}