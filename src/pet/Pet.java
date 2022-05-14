package pet;

import java.util.Scanner;

import exception.InformationFormatException;

public abstract class Pet implements PetInput{

	protected Petkind kind = Petkind.Dog;
	protected String name;
	protected int id;
	protected String information;
	protected String phone;

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

	public void setInformation(String information) throws InformationFormatException {
		if(!information.contains(",") && !information.equals("")) {
			throw new InformationFormatException();
		}
		this.information = information;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
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
	
	public abstract void printInfo();
	
	public void setPetId(Scanner input) {
    	System.out.print("Pet ID: ");
	    int id = input.nextInt();
	    this.setId(id);
	}
	public void setPetName(Scanner input) {
    	System.out.print("Pet name: ");
    	String name = input.next();
    	this.setName(name);
	}

	public void setPetInformation(Scanner input) {
		String information = "";
		while (!information.contains(",")) {
			System.out.print("Information: ");
			information = input.next();
			try {
				this.setInformation(information);
			} catch (InformationFormatException e) {
				System.out.println("Enter more information using the ','");
			}
		}

	}
	public void setPetPhone(Scanner input) {
    	System.out.print("Phone Number: ");
    	String phone = input.next();
    	this.setPhone(phone);
	}
	public String getKindString() {
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
		return skind;
	}
}
