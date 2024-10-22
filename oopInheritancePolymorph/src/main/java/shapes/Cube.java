package shapes;

public class Cube extends Shape3D {
    double size;

    public Cube(double size) {
        this.size = size;
        //Cube(new Rectangle(this.size, this.size));
    }

    private Cube(Rectangle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
