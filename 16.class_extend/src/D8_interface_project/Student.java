package D8_interface_project;

public class Student implements Mode1,Mode2{
    protected String[] name = new String[4];
    protected String[] sex = new String[4];
    protected int[] point = new int[4];

    public Student() {
        name[0] = "张三";
        name[1] = "李四";
        name[2] = "王五";
        name[3] = "赵六";
        sex[0] = "male";
        sex[1] = "female";
        sex[2] = "male";
        sex[3] = "female";
        point[0] = 90;
        point[1] = 80;
        point[2] = 70;
        point[3] = 60;
    }
    public Student(String[] name,String[] sex, int[] point) {
        this.name = name;
        this.sex = sex;
        this.point = point;
    }
    @Override
    public void printAll() {
        for(int i = 0; i < name.length; i++) {
            System.out.print("Name: " + name[i]);
            System.out.print(" Sex: " + sex[i]);
            System.out.print(" Point: " + point[i]);
            System.out.println();
        }
    }
    public void printAverage(){
        int avg = 0;
        for(int i = 0; i < point.length; i++) {
            avg += point[i];
        }
        avg /= point.length;
        System.out.println(avg);
    }

    public void printAll2() {
        int maleCount = 0, femaleCount = 0;
        for (int i = 0; i < name.length; i++) {
            if(sex[i].equals("male")) {
                maleCount++;
            }
            else if (sex[i].equals("female")) {
                femaleCount++;
            }
            System.out.print("Name: " + name[i]);
            System.out.print(" Sex: " + sex[i]);
            System.out.print(" Point: " + point[i]);
            System.out.println();
        }
        System.out.println("male count: "+maleCount);
        System.out.println("female count: "+femaleCount);
    }

    public void printAverage2() {
        int min = point[0], max = point[0], sum = 0;
        for (int i = 0; i < point.length - 1; i++) {
            if (point[i] <= point[i + 1]) {
                max = point[i + 1];
            }
            if (point[i] >= point[i + 1]) {
                min = point[i + 1];
            }
        }
        for (int i = 0; i < point.length; i++) {
            sum += point[i];
            System.out.print(point[i]+" ");
        }
        sum -= max;
        sum -= min;
        System.out.println("average except max and min: " + sum/(point.length - 2));
    }
}