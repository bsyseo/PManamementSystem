import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		int num = 0;
		
		while (num != 6) {
			
			System.out.println("Select One Number between 1-6: ");
			System.out.println("1. Add Pets");
		    System.out.println("2. Delete Pets");
		    System.out.println("3. Edit Pets");
		    System.out.println("4. View Pets");
		    System.out.println("5. Show a Menu");
		    System.out.println("6. Exit");
		    

			num = input.nextInt();
		    
		    if(num == 1)
		    {
		    	arraylist.addAll(addPet());
		    }
		    else if(num == 2)
		    {
		    	DeletePet(arraylist);
		    }
		    else if(num == 3)
		    {
		    	EditPet(arraylist);
		    }
		    else if(num == 4)
		    {
		    	ViewPet(arraylist);
		    }
		    else
		    {
		    	continue;
		    }
		    
		    }
		}
	
	public static ArrayList<String> addPet()
	{
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Add Pet: ");
			String AddPet = input.next();
			
			System.out.println("Pet Name: ");
			String PetName = input.next();
			
			System.out.println("Pet Information: ");
			String PetInformation = input.next();
			
			ArrayList<String> arraylist = new ArrayList<String>();
			arraylist.add(AddPet);
			arraylist.add(PetName);
			arraylist.add(PetInformation);
			
			for(String data : arraylist)
			{
				System.out.println(data + " ");
			}
			System.out.println();
			
			return arraylist;
		}
	}
	
	static void DeletePet(ArrayList<String> arraylist)
	{
		System.out.println("Delete Pet");
		
		arraylist.clear();
		
		System.out.println(arraylist);
		
	}
	
	static void EditPet(ArrayList<String> arraylist)
	{
		System.out.println(arraylist);
		System.out.println("Edit Pet: 1.Add Pet, 2.Pet Name, 3.Pet Information");
		try (Scanner input = new Scanner(System.in)) {
			int y = input.nextInt();
			System.out.println("Edit to: ");
			try (Scanner input1 = new Scanner(System.in)) {
				String z = input1.next();
				arraylist.set(y, z);
			}
		}
		System.out.println("Edit Pet: " + arraylist);
	}
	
	static void ViewPet(ArrayList<String> arraylist)
	{
		System.out.println(arraylist);
	}
	}



