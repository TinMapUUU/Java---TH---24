package ex6_3;

public class Test_6_3 {
	public static void main(String[] args) {
		MovablePoint point = new MovablePoint(3, 5);
		System.out.println("Initial position: " + point);

		point.moveUp();
		point.moveLeft();
		System.out.println("After moving up and left: " + point);

		point.moveDown();
		point.moveRight();
		System.out.println("After moving down and right: " + point);
	}	
}
