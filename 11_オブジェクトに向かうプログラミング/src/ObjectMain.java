public class ObjectMain {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "wang";
        stu1.male = "male";
        stu1.point = 80;
        //メモリーアドレスを出力する
        System.out.println(stu1);
        stu1.GetName();
        stu1.GetPoint();
    }    
}