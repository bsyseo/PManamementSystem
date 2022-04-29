package pet;

import java.util.Scanner;

public class livestock extends Pet {
	
	protected String FarmAddress;
	protected String FarmNumber;
	
	public livestock(Petkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Pet ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Pet Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while(answer !='y' && answer != 'Y' && answer !='n' && answer != 'N')
		{
			System.out.print("Do you have an Farm address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer=='y' || answer == 'Y') {
				System.out.print("Farm address: ");
				String information = input.next();
				this.setInformation(information);
				break;
				}
			else if(answer=='n' || answer == 'N') {
				this.setInformation("");
				break;
				}
			else {
				
			}
		}
		System.out.print("Phone number: ");
		String phone = input.next();
		this.setPhone(phone);
		
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
		System.out.println("Farm address: " + information);
		System.out.println("Farm number: " + phone);
	}
}
