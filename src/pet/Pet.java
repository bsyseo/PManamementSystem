package pet;

import java.util.Scanner;

public class Pet {

	protected Petkind kind = Petkind.Dog;
	public Petkind getKind() {
		return kind;
	}
	
	public Pet(Petkind kind) {
		this.kind = kind;
	}

	public void setKind(Petkind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	protected String name;
	protected int id;
	protected String information;
	protected String phone;

	
	public Pet() {
		
	}
	
	public Pet(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	
	public Pet(String name, int id, String information, String phone) {
		this.name = name;
		this.id = id;
		this.information = information;
		this.phone = phone;
		
	}
	public Pet(Petkind kind, String name, int id, String information, String phone) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.information = information;
		this.phone = phone;
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

}
