package ex6_4;

public class Test_6_4 {

	public static void main(String[] args) {
		MovableCircle point = new MovableCircle(2, 4, 5);
		System.out.println("Initial position: " + point);

		point.moveUp();
		point.moveLeft();
		System.out.println("After moving up and left: " + point);

		point.moveDown();
		point.moveRight();
		System.out.println("After moving down and right: " + point);
	}

}
