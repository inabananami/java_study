package d4_collection_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest3 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student s1 = new Student("111",25, 169.6);
        Student s2= new Student("111",25, 169.6);
        students.add(s1);
        students.add(s2);

        //四つのアドレスがある
        System.out.println(students);
    }
}
