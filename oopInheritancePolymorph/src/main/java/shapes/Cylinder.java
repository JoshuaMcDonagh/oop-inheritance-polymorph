package shapes;

public class Cylinder extends Shape3D {
    double height;

    public Cylinder(double height, Circle base) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {

        double result = base.calculateArea() * height;
        return result;
    }
}
