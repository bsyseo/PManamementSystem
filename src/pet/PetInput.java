package pet;

import java.util.Scanner;

public interface PetInput {
	public void setName(String name);
	public void setId(int id);
	public void setInformation(String information);
	public int getId();
	public void setPhone(String phone);
	public void getUserInput(Scanner input);
	public void printInfo();
	
}
