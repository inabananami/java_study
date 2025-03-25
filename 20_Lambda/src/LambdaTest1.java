public class LambdaTest1 {
    public static void main(String[] args) {
//        Animal a = new Animal() {
//            @Override
//            public void run() {
//                System.out.println("犬は速く走った~~");
//            }
//        };
//        a.run();

//        Swimming s = new Swimming() {
//            @Override
//                public void swim() {
//                System.out.println("学生は楽しく泳いでいる");
//            }
//        };
//        s.swim();

        //これはLambda式だ
        Swimming s2 = () -> {
            System.out.println("学生は楽しく泳いでいるのだ");
        };
        s2.swim();
    }
}

abstract class Animal {
    public abstract void run();
}

interface Swimming {
    void swim();
}