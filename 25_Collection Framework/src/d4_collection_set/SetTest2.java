package d4_collection_set;

public class SetTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("111", 25, 169.5);
        Student s2 = new Student("222", 27, 170);
        //hash値を獲得する
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println();

        //hash値が丁度あった場合
        String str1 = new String("abc");
        String str2 = new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
