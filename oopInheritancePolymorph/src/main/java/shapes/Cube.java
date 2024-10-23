package shapes;

public class Cube extends Shape3D {
    double size;

    public Cube(double size) {
        this(new Rectangle(size, size));
        this.size = size;
    }

    private Cube(Rectangle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * this.size;
    }
}
