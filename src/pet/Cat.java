package pet;

import java.util.Scanner;

public class Cat extends BabyPet {
	
	public Cat(Petkind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setPetId(input);
		setPetName(input);
		setPetInformationwithYN(input);
		setPetPhone(input);
	}
	

}
