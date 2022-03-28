import java.util.Scanner;

public class Menu {

	private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6) {
			System.out.println("*** Pet Management System Menu ***");
			System.out.println("1. Add Pet");
			System.out.println("2. Delet Pet");
			System.out.println("3. Edit Pet");
			System.out.println("4. View Pet");
			System.out.println("5. Show Pet");
			System.out.println("6. Exit Pet");
			System.out.println("Select One Number between 1 - 5: ");
			num = input.nextInt();
			if(num==1) {
				addpet();
			}
			else if(num==2) {
				deletepet();
			}
			else if(num==3) {
				editpet();
			}
			else if(num==4) {
				viewpet();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addpet() {
		Scanner input = new Scanner(System.in);
		System.out.print("Pet Id:");
		int PetId = input.nextInt();
		System.out.print("Pet Name:");
		String PetName = input.next();
		System.out.println(PetName);
		System.out.print("Pet Information:");
		String PetInformation = input.next();
		System.out.println(PetInformation);
		System.out.print("phone number:");
		String number = input.next();
		System.out.println(number);

	}
	
	public static void deletepet() {
		Scanner input = new Scanner(System.in);
		System.out.print("Delete Pet");
	}
	
	public static void editpet() {
		Scanner input = new Scanner(System.in);
		System.out.print("Edit Pet");
		
	}
	
	public static void viewpet() {
		Scanner input = new Scanner(System.in);
		System.out.print("View Pet");
	}
	
	}



