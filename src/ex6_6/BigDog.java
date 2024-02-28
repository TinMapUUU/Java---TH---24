package ex6_6;

public class BigDog extends Dog{

	public BigDog(String name, int age) {
		super(name, age);
		
	}
	
	@Override
	public void greets() {
		System.out.println("Ang Ang");
		
	}

}
