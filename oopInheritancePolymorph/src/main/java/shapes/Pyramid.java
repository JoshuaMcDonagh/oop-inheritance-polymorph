package shapes;

public class Pyramid extends Shape3D {
    double height;

    public Pyramid(double height, Shape base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        double result = (base.calculateArea() * height) / 3;
        return result;
    }
}
