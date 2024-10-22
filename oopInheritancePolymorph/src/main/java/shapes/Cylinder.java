package shapes;

public class Cylinder extends Shape3D {
    double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {

        double result = base.calculateArea() * height;
        return result;
    }
}
