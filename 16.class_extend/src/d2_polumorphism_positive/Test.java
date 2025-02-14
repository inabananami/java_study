package d2_polumorphism_positive;

public class Test {
    public static void main(String[] args) {
        //メリット1:　右のオブジェクトはいつでも差し替えできて、後の業務も変更しやすい
        People p2 = new Teacher();
        p2.run();
//        Teacher t = (Teacher) p2;
        ((Teacher) p2).teach();

        //メリット2:　父クラスの変数を使って形参にする。すべての子オブジェクトを受け取れる
//        public static void go(People p) {
//            People pt = new Teacher();
//            People pt2 = new Student();
//        }
    }
}