
import java.util.Scanner;

import pet.Cat;
import pet.Dog;
import pet.Pet;
import pet.PetInput;
import pet.Petkind;
import pet.livestock;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class PetManager{
	ArrayList<PetInput> pets = new ArrayList<PetInput>();
	Scanner input;
	PetManager(Scanner input){
		this.input = input;
	}
	
	public void addpet() {

		int kind = 0;
		PetInput petInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("go into add pets in while");
				System.out.println("1. Dog");
				System.out.println("2. Cat");
				System.out.println("3. Livestock");
				System.out.print("Select num 1-3: ");
				kind = input.nextInt();
				if (kind == 1) {
					petInput = new Dog(Petkind.Dog);
					petInput.getUserInput(input);
					pets.add(petInput);
					break;
				} else if (kind == 2) {
					petInput = new Cat(Petkind.Cat);
					petInput.getUserInput(input);
					pets.add(petInput);
					break;
				} else if (kind == 3) {
					petInput = new livestock(Petkind.livestock);
					petInput.getUserInput(input);
					pets.add(petInput);
					break;
				} else {
					System.out.print("Select Pet kind between 1 and 2: ");
				}
			} catch (InputMismatchException e) {
				System.out.println("Plase put an integer between 1 and 3!");
				if(input.hasNext());
				input.next();
			}
			kind = -1;

		}

	}
	
	public void deletepet() {
		System.out.print("Pet ID: ");
		int petid = input.nextInt();
		int index = findIndex(petid);
		removefromPets(index, petid);
	}
	
	public int findIndex(int petid) {
		int index=-1;
		for(int i=0; i<pets.size(); i++) {
			if(pets.get(i).getId() == petid) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromPets(int index, int petid) {
		if(index>=0) {
			pets.remove(index);
			System.out.println("the pet" + petid + "is deleted");
			return 1;
		}
		else {
			System.out.println("the pet has not been registered.");
			return -1;
		}
	}
	
	public void editpet() {
		System.out.print("Pet ID: ");
		int petid = input.nextInt();
		for(int i=0; i<pets.size(); i++) {
			PetInput pet = pets.get(i);
			if(pet.getId() == petid) {
				int num = -1;
				while(num != 5) {
					showEditMenu();
				    num = input.nextInt();
				    switch(num) {
				    case 1:
				    	pet.setPetId(input);
				    	break;
				    case 2:
				    	pet.setPetName(input);
				    	break;
				    case 3:
				    	pet.setPetInformation(input);
				    	break;
				    case 4:
				    	pet.setPetPhone(input);
				    	break;
				    default:
				    	continue;
				    	}
				    } //while
				break;
				} //if
			} //for
		}
	
	public void viewpets() {
		System.out.println("# of registered pets:" + pets.size());
		for(int i=0; i<pets.size(); i++) {
			pets.get(i).printInfo();
		}
	}
	public void showEditMenu() {
		System.out.println("** Pet Info Edit Menu **");
	    System.out.println("1. Edit Id");
	    System.out.println("2. Edit Name");
	    System.out.println("3. Edit information");
	    System.out.println("4. Edit Phone");
	    System.out.println("5. Exit ");
	    System.out.println("Select One Number between 1 - 5: ");
	}
}
