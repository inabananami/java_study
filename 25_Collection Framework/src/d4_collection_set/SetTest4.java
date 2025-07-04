package d4_collection_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest4 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(4);
        System.out.println(set);

        //並べない
        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            //身長に応じて並ぶ
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        students.add(new Student("111", 23, 150));
        students.add(new Student("222", 26, 147));
        students.add(new Student("333", 33, 185));
        students.add(new Student("444", 41, 175));
        System.out.println(students);
    }
}
