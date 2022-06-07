package pet;

import java.util.Scanner;

public class Dog extends Pet {
	
	public Dog(Petkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setPetId(input);
		setPetName(input);
		setPetInformation(input);
		setPetPhone(input); 
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind);
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("information: " + information);
		System.out.println("phone: " + phone);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
