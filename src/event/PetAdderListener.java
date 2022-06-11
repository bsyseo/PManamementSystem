package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.InformationFormatException;
import manager.PetManager;
import pet.Dog;
import pet.Pet;
import pet.PetInput;
import pet.Petkind;

public class PetAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldInformation;
	JTextField fieldPhone;
	
	PetManager petManager;
	
	public PetAdderListener(JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldInformation,
			JTextField fieldPhone, PetManager petManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldInformation = fieldInformation;
		this.fieldPhone = fieldPhone;
		this.petManager = petManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PetInput pet = new Dog(Petkind.Dog);

		try {
			pet.setId(Integer.parseInt(fieldID.getText()));
			pet.setName(fieldName.getName());
			pet.setInformation(fieldInformation.getText());
			pet.setPhone(fieldPhone.getText());
			petManager.addpet(pet);
			putObject(petManager, "petmanager.ser");
			pet.printInfo();
		} catch (InformationFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
