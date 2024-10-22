package shapes;

public class Cone extends Shape3D {
    double height;

    public Cone(double height, Circle base) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        double result = (base.calculateArea() * height) / 3;
        return result;
    }
}
