package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class Menu {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		PetManager petManager = getObject("petmanager.ser");
		if(petManager == null) {
			petManager = new PetManager(input);
		}
		else {
			petManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(petManager);
		selectMenu(input, petManager);
		putObject(petManager, "petmanager.ser");
	}
	
	public static void selectMenu(Scanner input, PetManager petManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
			    num = input.nextInt();
			    switch(num) {
			    case 1:
			    	petManager.addpet();
			    	logger.log("add a pet");
			    	break;
			    case 2:
				    petManager.deletepet();
				    logger.log("delete a pet");
				    break;
			    case 3:
				    petManager.editpet();
				    logger.log("edit a pet");
				    break;
			    case 4:
				    petManager.viewpets();
				    logger.log("edit a list of pet");
				    break;
			    default:
				    continue;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Pet Management System Menu ***");
		System.out.println("1. Add Pet");
		System.out.println("2. Delet Pet");
		System.out.println("3. Edit Pet");
		System.out.println("4. View Pet");
		System.out.println("5. Exit ");
		System.out.println("Select One Number between 1 - 5: ");
	}
	
	public static PetManager getObject(String filename) {
		PetManager petManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			petManager = (PetManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return petManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return petManager;
	}


public static void putObject(PetManager petManager, String filename) {
	try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(petManager);
		
		out.close();
		file.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}



