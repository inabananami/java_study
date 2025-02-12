package D2StaticMethod;

public class Test {
    public static void main(String[] args) {
        //クラス名.クラス方法（おすすめ）
        Student.printHelloWorld();

        //オブジェクト.クラス方法（お勧めしない）
        Student s = new Student();
        s.printHelloWorld();

        //オブジェクト.実例方法だけ、効用できる
        s.score = 60;
        s.printPass();
//        Student.printPass();　　//エラーが発生する

    }
}
