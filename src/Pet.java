
public class Pet {
	
	String name;
	int id;
	String information;
	String phone;
	
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
	
	public void printInfo() {
		System.out.println("name: " + name + "Id: " + id + "Information: " + information + "Phone number: " + phone);
	}
	
}
