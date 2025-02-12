package d14_extends_constructor;

class F {
    public F() {
        System.out.println("F occurred.");
    }
    public F(String s, int i) {
        System.out.println("occurred2");
    }
}

class Z extends F {
    public Z() {
        //super()は指定された構造器を指すという役に立つ
        super("van", 18);
        System.out.println("Z occurred.");
    }
    public Z(String name) {
        //super()はお先に存在しているもの
        super();
        System.out.println("wow occurred.");
    }
}

public class Test {
    public static void main(String[] args) {
        //父クラスの構造器を呼び出した上、子クラスのものを呼び出す
        Z z = new Z();
        Z z2 = new Z("wan");
    }
}
