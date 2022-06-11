package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.PetAdderCancelListener;
import event.PetAdderListener;
import manager.PetManager;

public class PetAdder extends JPanel{
	
	WindowFrame frame;
	PetManager petManager;
	
	public PetAdder(WindowFrame frame, PetManager petManager) {
		this.frame = frame;
		this.petManager = petManager;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("NAME: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelInformation = new JLabel("INFO: ", JLabel.TRAILING);
		JTextField fieldInformation = new JTextField(10);
		labelID.setLabelFor(fieldInformation);
		panel.add(labelInformation);
		panel.add(fieldInformation);
		
		JLabel labelPhone = new JLabel("PHONE: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new PetAdderListener(fieldID, fieldName, fieldInformation, fieldPhone, petManager));;
		JButton CancelButton = new JButton("cancel");
		CancelButton.addActionListener(new PetAdderCancelListener(frame));
		
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(saveButton);
		panel.add(CancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
