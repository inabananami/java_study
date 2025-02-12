package d11_extend_feature;

public class ExtendDemo {
    public static void main(String[] args) {
        Square s = new Square(11.2, 11.3);
        Cuboid c = new Cuboid(22.2, 33.3, 2.0);
        s.GetSquare();
        c.GetVolumn();
        c.GetSquare();
    }
}