package ex6_5;

public class Circle implements GeometricObject {
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}


