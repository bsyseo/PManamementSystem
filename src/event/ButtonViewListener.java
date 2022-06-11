package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.PetViewer;
import gui.WindowFrame;
import manager.PetManager;

public class ButtonViewListener implements ActionListener{
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PetViewer petviewer = frame.getPetviewer();
		PetManager petManager = getObject("petmanager.ser");
		petviewer.setPetManager(petManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(petviewer);
		frame.revalidate();
		frame.repaint();
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


}
