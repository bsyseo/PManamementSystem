package pet;

import java.util.Scanner;

import exception.InformationFormatException;

public class livestock extends BabyPet {
	
	protected String FarmAddress;
	protected String FarmNumber;
	
	public livestock(Petkind kind) {
		super(kind);
	}

	
	public void getUserInput(Scanner input) {
		setPetId(input);
		setPetName(input);
		setPetInformationwithYN(input);
		setParentInformationwithYN(input);
		setPetPhone(input);
		
	}

	public void setParentInformationwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an Farm address? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setPetInformation(input);
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
	public void printInfo() {
		
		String skind = getKindString();
		System.out.println("kind: " + skind);
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("Farm address: " + information);
		System.out.println("Farm number: " + phone);
	}


	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
