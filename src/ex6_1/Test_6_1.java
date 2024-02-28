package ex6_1;

public class Test_6_1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        // System.out.println("Radius: " + s1.getRadius()); // Compilation Error: Shape doesn't have getRadius() method

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Filled: " + c1.isFilled());
        System.out.println("Radius: " + c1.getRadius());

        // Shape s2 = new Shape(); // Compilation Error: Shape is abstract; cannot be instantiated

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
        System.out.println("Color: " + s3.getColor());
        // System.out.println("Length: " + s3.getLength()); // Compilation Error: Shape doesn't have getLength() method

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Color: " + r1.getColor());
        System.out.println("Length: " + r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println("Area: " + s4.getArea());
        System.out.println("Color: " + s4.getColor());
        // System.out.println("Side: " + s4.getSide()); // Compilation Error: Shape doesn't have getSide() method

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Color: " + r2.getColor());
        System.out.println("Side: " + r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Color: " + sq1.getColor());
        System.out.println("Side: " + sq1.getSide());
    }
}
