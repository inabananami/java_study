package d6_singleInstance;

public class B {
    //クラス変数を宣言し、クラスを記憶する
    private static B b;

    //クラスの構造器をプライベートにする
    private B() {
        String name = "wan";
    }

    //クラス方法を宣言する。この方法は、
    // 初回呼び出し時のみオブジェクトを作成し、
    // その後の呼び出しでは同じオブジェクトで返す
    public static B getInstance() {
        if(b == null) {
            b = new B();
        }
        return b;
    }
}
