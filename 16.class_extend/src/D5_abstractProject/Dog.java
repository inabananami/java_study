package D5_abstractProject;

public class Dog extends Animal {
    public Dog() {
        name = "a dog";
    }
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void GetName() {
        System.out.println(name);
    }
    @Override
    public void Voice() {
        System.out.println("bark!");
    }
}
