package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.PetManager;
import pet.PetInput;

public class PetViewer extends JPanel{
	WindowFrame frame;
	
	PetManager petManager;
	
	public PetManager getPetManager() {
		return petManager;
	}

	public void setPetManager(PetManager petManager) {
		this.petManager = petManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Info");
		model.addColumn("Contact Info.");
		
		for(int i = 0; i<petManager.size(); i++) {
			Vector row = new Vector();
			PetInput pi = petManager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getInfo());
			row.add(pi.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public PetViewer(WindowFrame frame, PetManager petManager) {
		this.frame = frame;
		this.petManager = petManager;
		
		
		System.out.println("***" + petManager.size() + "***");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Info");
		model.addColumn("Contact Info.");
		
		for(int i = 0; i<petManager.size(); i++) {
			Vector row = new Vector();
			PetInput pi = petManager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getInfo());
			row.add(pi.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
