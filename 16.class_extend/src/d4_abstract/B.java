package d4_abstract;

class B extends A {
    String name;

    public B() {
        name = "wan";
    }

    @Override
    public void run() {
        System.out.println("running!");
    }
}