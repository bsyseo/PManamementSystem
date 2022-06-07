package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PetManager;

public class WindowFrame extends JFrame{
	PetManager petManager;
	
	MenuSelection meneselection;
	PetAdder petadder;
	PetViewer petviewer;
	
	public WindowFrame(PetManager petManager) {
		this.setTitle("My Frame");
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.petManager = petManager;
		meneselection = new MenuSelection(this);
		petadder = new PetAdder(this);
		petviewer = new PetViewer(this, this.petManager);
		
	
		//this.setupPanel(meneselection);
		this.add(meneselection);
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMeneselection() {
		return meneselection;
	}

	public void setMeneselection(MenuSelection meneselection) {
		this.meneselection = meneselection;
	}

	public PetAdder getPetadder() {
		return petadder;
	}

	public void setPetadder(PetAdder petadder) {
		this.petadder = petadder;
	}

	public PetViewer getPetviewer() {
		return petviewer;
	}

	public void setPetviewer(PetViewer petviewer) {
		this.petviewer = petviewer;
	}

}
