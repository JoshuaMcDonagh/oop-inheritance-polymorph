package shapes;

public class Sphere extends Shape3D {

    public Sphere(Shape base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        double result;

        if (base instanceof Circle) {
            double cubedRadius = Math.pow(((Circle) base).radius, 3);
            result = Math.PI * cubedRadius * (4 / 3);
        } else {
            result = 0;
        }

        return result;
    }
}
