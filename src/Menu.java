
public class Menu {

	public static void main(String[] args) {
		
		int num = 0;
		
		while (num ! = 6) {
			System.out.println("1. Add Pets");
		    System.out.println("2. Delete Pets");
		    System.out.println("3. Edit Pets");
		    System.out.println("4. View Pets");
		    System.out.println("5. Show a Menu");
		    System.out.println("6. Exit");
		    System.out.println("Select One Number between 1-6: ");
		    num = input.nextInt();
		    switch(num) {
		    case 1:
		    	System.out.print("Pet Id:");
		    	int petId = input.nextInt();
		    	System.out.print("Pet Name:");
		    	String petName = input.next();
		    	break;
		    case 2:
		    case 3:
		    case 4:
		    	System.out.print("Pet Id:");
		    	Int petId2 = input.nextInt();
		    }
		}
	
		

	}

}
