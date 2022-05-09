package pet;

import java.util.Scanner;

public abstract class Pet {

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

	public void setInformation(String information) {
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

}
