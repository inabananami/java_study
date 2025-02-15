package D8_interface_project;

public class Student implements Mode1,Mode2{
    protected String[] name;
    protected String[] sex;
    protected int[] point;

    public Student(String[] name,String[] sex, int[] point) {
        this.name = name;
        this.sex = sex;
        this.point = point;
    }
    @Override
    public void printAll() {
        for(int i = 0; i < name.length; i++) {
            System.out.print("Name: " + name);
            System.out.print(" Sex: " + sex);
            System.out.print(" Point: " + point);
            System.out.println();
        }
    }
    public void printAverage(){
        for(int i = 0; i < point.length; i++) {

        }
    }
}
