package ex6_2;

public class Circle implements GeometricObject{
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return 3.14 * r * r;
	}

	@Override
	public double getPerimeter() {		
		return 2 * 3.14 * r;
	}

	public double getRadius() {
		return r;
	}

	public void setRadius(double r) {
		this.r = r;
	}


}
