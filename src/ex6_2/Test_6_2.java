package ex6_2;

public class Test_6_2 {
	public static void main(String[] args) {
		Circle circle = new Circle(8);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());      
        System.out.println();       
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
	}
}
