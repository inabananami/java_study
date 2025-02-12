package d11_extend_feature;

class Cuboid extends Square {
    protected double height;
    public Cuboid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    public void GetVolumn() {
        System.out.printf("volumn is: %.2f ", height * length * width);
        System.out.println();
    }
    public void GetSquare() {
        System.out.println("extend_visit.Cuboid square is: "+(length + width + height) * 2);
    }
}