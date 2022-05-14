package pet;

import java.util.Scanner;

import exception.InformationFormatException;

public abstract class BabyPet extends Pet {
	public BabyPet(Petkind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind);
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("information: " + information);
		System.out.println("phone: " + phone);
	}
	
	public void setPetInformationwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an Pet Information? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Pet information: ");
					String information = input.next();
					this.setInformation(information);
					break;
				} else if (answer == 'n' || answer == 'N') {
					this.setInformation("");
					break;
				} else {

				}
			} catch (InformationFormatException e) {
				System.out.println("Enter more information using the ','");
			}
		}
	}

}
