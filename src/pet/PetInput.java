package pet;

import java.util.Scanner;

import exception.InformationFormatException;

public interface PetInput {
	public int getId();
	public void setId(int id);
	
	public String getName();
	public void setName(String name);
	
	public String getInfo();
	public void setInformation(String information) throws InformationFormatException;
	
	public String getPhone();
	public void setPhone(String phone);
		
	public void printInfo();
	
	public void getUserInput(Scanner input);

	public void setPetId(Scanner input);
	public void setPetName(Scanner input);
	public void setPetInformation(Scanner input);
	public void setPetPhone(Scanner input);
	

	
	
}
