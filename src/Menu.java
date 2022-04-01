import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PetManager PetManager = new PetManager(input);
		
		int num = -1;
		
		while(num != 5) {
			System.out.println("*** Pet Management System Menu ***");
			System.out.println("1. Add Pet");
			System.out.println("2. Delet Pet");
			System.out.println("3. Edit Pet");
			System.out.println("4. View Pet");
			System.out.println("5. Exit ");
			System.out.println("Select One Number between 1 - 5: ");
			num = input.nextInt();
			if(num==1) {
				PetManager.addpet();
			}
			else if(num==2) {
				PetManager.deletepet();
			}
			else if(num==3) {
				PetManager.editpet();
			}
			else if(num==4) {
				PetManager.viewpet();
			}
			else {
				continue;
			}
		}
	}
	
	
	}



