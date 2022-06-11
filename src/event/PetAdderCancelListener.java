package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.InformationFormatException;
import gui.WindowFrame;
import manager.PetManager;
import pet.Dog;
import pet.Pet;
import pet.PetInput;
import pet.Petkind;

public class PetAdderCancelListener implements ActionListener {
	WindowFrame frame;
	
	public PetAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMeneselection());
		frame.revalidate();
		frame.repaint();
	}

}
