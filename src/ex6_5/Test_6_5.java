package ex6_5;

public class Test_6_5 {
	public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(4);
        System.out.println("Original radius: " + circle.r);
        circle.resize(20);
        System.out.println("Resized radius: " + circle.r);
    }
}
