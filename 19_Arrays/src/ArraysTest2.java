import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("佐藤さん", 175.5, 22);
        students[1] = new Student("諏訪さん",  154, 19);
        students[2] = new Student("後藤さん", 155, 16);
        students[3] = new Student("上原さん", 162, 17);

//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //比較規則を設定する
                if(o1.getHeight() > o2.getHeight()) {
                    return 1;
                }else if(o1.getHeight() < o2.getHeight()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(students));
    }
}