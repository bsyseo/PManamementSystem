import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PetManager petManager = new PetManager(input);
		
		selectMenu(input, petManager);
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
			    	break;
			    case 2:
				    petManager.deletepet();
				    break;
			    case 3:
				    petManager.editpet();
				    break;
			    case 4:
				    petManager.viewpets();
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
}



