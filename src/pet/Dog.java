package pet;

import java.util.Scanner;

public class Dog extends Pet implements PetInput {
	
	public Dog(Petkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Pet ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Pet Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Pet Information: ");
		String information = input.next();
		this.setInformation(information);
		
		System.out.print("Phone number: ");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind){
		case Dog:
			skind = "dog";
			break;
		case Cat:
			skind = "Cat";
			break;
		case Others:
			skind = "Others";
			break;
		case livestock:
			skind = "livestock";
			break;
		default:
		}
		System.out.println("kind: " + skind);
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("information: " + information);
		System.out.println("phone: " + phone);
	}
}
