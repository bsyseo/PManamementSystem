
import java.util.Scanner;

public class PetManager{
	Pet pet;
	
	Scanner input;
	
	PetManager(Scanner input){
		this.input = input;
		
	}
	
	public void addpet() {
		
		pet = new Pet();
	
		System.out.print("Pet ID: ");
		pet.id = input.nextInt();
		
		System.out.print("Pet Name: ");
		pet.name = input.next();
		
		System.out.print("Pet Information: ");
		pet.information = input.next();
		
		System.out.print("Phone number: ");
		pet.phone = input.next();
	}
	
	public void deletepet() {
	
		System.out.print("Pet ID: ");
		int petid = input.nextInt();
		if(pet.id == petid) {
			return;
		}
		System.out.println("the pet has not been regostered");
		if(pet == null) {
			return;
		}
		if(pet.id == petid){
			pet = null;
			System.out.println("the pet is deleted.");
		}
	}
	
	public void editpet() {
		System.out.print("Pet ID: ");
		int petid = input.nextInt();
		if(pet.id == petid) {
			System.out.println("the pet to be edited is " + petid);
		}
	}
	
	public void viewpet() {
		System.out.print("Pet ID: ");
		int petid = input.nextInt();
		if(pet.id == petid) {
			pet.printInfo();
		}
	}
}
