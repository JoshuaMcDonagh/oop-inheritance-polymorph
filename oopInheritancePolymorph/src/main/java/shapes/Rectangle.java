package shapes;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

}
