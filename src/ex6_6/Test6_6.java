package ex6_6;

import java.util.Scanner;

public class Test6_6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the type of animal (cat/dog/bigdog):");
	        String animalType = scanner.nextLine().toLowerCase(); // Read input and convert to lowercase

	        Animal animal;
	        switch (animalType) {
	            case "cat":
	                animal = new Cat("Whiskers", 5);
	                break;
	            case "dog":
	                animal = new Dog("Buddy", 3);
	                break;
	            case "bigdog":
	                animal = new BigDog("Max", 4);
	                break;
	            default:
	                System.out.println("Invalid animal type!");
	                return; // Exit the program if the input is invalid
	        }

	        System.out.println("You selected: " + animalType);
	        System.out.println(animal);
	        animal.greets();

	        scanner.close();

	}

}
