package d11_extend_feature;

public class Square {
    protected double length;
    protected double width;
    public Square() {
        length = 1;
        width = 1;
    }
    public Square(double l, double w) {
        length = l;
        width = w;
    }
    public void GetSquare() {
        System.out.println("square is: "+length * width);
    }
}