import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("佐藤さん", 175.5, 22);
        students[1] = new Student("諏訪さん",  154, 19);
        students[2] = new Student("後藤さん", 155, 16);
        students[3] = new Student("上原さん", 162, 17);

        //元の書き方
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        //Lambda式を使う
//        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        //方法引用の例
        Arrays.sort(students, CompareByData::compareByAge);

        System.out.println(Arrays.toString(students));
    }
}