
import java.util.Scanner;

import pet.Cat;
import pet.Dog;
import pet.Pet;
import pet.PetInput;
import pet.Petkind;
import pet.livestock;

import java.util.ArrayList;

public class PetManager{
	ArrayList<PetInput> pets = new ArrayList<PetInput>();
	Scanner input;
	PetManager(Scanner input){
		this.input = input;
	}
	
	public void addpet() {
		
		int kind = 0;
		PetInput petInput;
		while(kind !=1 && kind !=2) {
			System.out.println("1. Dog");
			System.out.println("2. Cat");
			System.out.println("3. Livestock");
			System.out.print("Select num 1-3: ");
			kind = input.nextInt();
			if(kind == 1) {
				petInput = new Dog(Petkind.Dog);
				petInput.getUserInput(input);
				pets.add(petInput);
				break;
			}
			else if(kind ==2) {
				petInput = new Cat(Petkind.Cat);
				petInput.getUserInput(input);
				pets.add(petInput);
				break;
			}
			else if(kind==3) {
				petInput = new livestock(Petkind.livestock);
				petInput.getUserInput(input);
				pets.add(petInput);
				break;
			}
			else {
				System.out.print("Select Pet kind between 1 and 2: ");
			}
		}

	
	}
	
	public void deletepet() {
		System.out.print("Pet ID: ");
		int petid = input.nextInt();
		int index=-1;
		for(int i=0; i<pets.size(); i++) {
			if(pets.get(i).getId() == petid) {
				index = i;
				break;
			}
		}
		
		if(index>=0) {
			pets.remove(index);
			System.out.println("the pet" + petid + "is deleted");
		}
		else {
			System.out.println("the pet has not been registered.");
			return;
		}
	}
	
	public void editpet() {
		System.out.print("Pet ID: ");
		int petid = input.nextInt();
		for(int i=0; i<pets.size(); i++) {
			PetInput petInput = pets.get(i);
			if(petInput.getId() == petid) {
				int num = -1;
				while(num != 5) {
					System.out.println("** Pet Info Edit Menu **");
				    System.out.println("1. Edit Id");
				    System.out.println("2. Edit Name");
				    System.out.println("3. Edit information");
				    System.out.println("4. Edit Phone");
				    System.out.println("5. Exit ");
				    System.out.println("Select One Number between 1 - 5: ");
				    num = input.nextInt();
				    if(num==1) {
				    	System.out.print("Pet ID: ");
					    int id = input.nextInt();
					    petInput.setId(id);
					    }
				    else if(num==2) {
				    	System.out.print("Pet name: ");
				    	String name = input.next();
				    	petInput.setName(name);
				    	}
				    else if(num==3) {
				    	System.out.print("Information: ");
				    	String information = input.next();
				    	petInput.setInformation(information);
				    	}
				    else if(num==4) {
				    	System.out.print("Phone Number: ");
				    	String phone = input.next();
				    	petInput.setPhone(phone);
				    	}
				    else {
				    	continue;
				    	} //if
				    } //while
				break;
				} //if
			} //for
		}
	
	public void viewpets() {
//		System.out.print("Pet ID: ");
//		int petid = input.nextInt();
		System.out.println("# of registered pets:" + pets.size());
		for(int i=0; i<pets.size(); i++) {
			pets.get(i).printInfo();
		}
	}
}
