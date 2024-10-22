package shapes;

public abstract class Shape3D {
    protected Shape base;

    public Shape getBase() {
        return base;
    }

    public abstract double calculateVolume();
}

