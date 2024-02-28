package ex6_6;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void greets() {
		System.out.println("Meo");
		
	}
	

}
