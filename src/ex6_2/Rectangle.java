package ex6_2;

public class Rectangle implements GeometricObject {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
}
