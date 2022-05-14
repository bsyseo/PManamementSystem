package pet;

import java.util.Scanner;

import exception.InformationFormatException;

public interface PetInput {
	public void setName(String name);
	public void setId(int id);
	public void setInformation(String information) throws InformationFormatException;
	public int getId();
	public void setPhone(String phone);
	public void getUserInput(Scanner input);
	public void printInfo();
	public void setPetId(Scanner input);
	public void setPetName(Scanner input);
	public void setPetInformation(Scanner input);
	public void setPetPhone(Scanner input);
	
}
