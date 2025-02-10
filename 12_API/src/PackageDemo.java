//他のパッケージを使用するとき、importを使うべきです。
import ThisDemo.src.Student;

public class PackageDemo {
    public static void main(String[] args) {
        Student s1 = new Student("wang", "male", 80);
        System.out.println(s1.GetName());
    }
}