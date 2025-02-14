package D5_abstractProject;

public class Cat extends Animal {
    public Cat() {
        name = "a Cat";
    }
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void GetName() {
        System.out.println(name);
    }
    @Override
    public void Voice() {
        System.out.println("moew!");
    }
}
