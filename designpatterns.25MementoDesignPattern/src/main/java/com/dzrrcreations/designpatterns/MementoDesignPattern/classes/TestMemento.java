package com.dzrrcreations.designpatterns.MementoDesignPattern.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestMemento extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new TestMemento();
	}
	
	private JButton btnSave, btnUndo, btnRedo;
	private JTextArea theArticle = new JTextArea(40, 60);

	Caretaker caretaker = new Caretaker();
	Originator originator = new Originator();
	
	int savedFiles = 0, currentArticle = 0;
	
	public TestMemento() {
		
		this.setSize(650, 740);
		this.setTitle("Memento Design Pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Article"));
		panel1.add(theArticle);
		
		ButtonListener saveListener = new ButtonListener();
		ButtonListener undoListener = new ButtonListener();
		ButtonListener redoListener = new ButtonListener();
		
		btnSave = new JButton("Save");
		btnUndo = new JButton("Undo");
		btnRedo = new JButton("Redo");
		
		btnSave.addActionListener(saveListener);
		btnUndo.addActionListener(undoListener);
		btnRedo.addActionListener(redoListener);
		
		panel1.add(btnSave);
		panel1.add(btnUndo);
		panel1.add(btnRedo);
		
		//Save empty string to memento index 0
		String textInTextArea = theArticle.getText();
		originator.setArticle(textInTextArea);
		caretaker.addMemento(originator.storeInMemento());
		btnUndo.setEnabled(false);
		btnRedo.setEnabled(false);
		
		this.add(panel1);
		this.setVisible(true);
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnSave) {
				String textInTextArea = theArticle.getText();
				originator.setArticle(textInTextArea);
				caretaker.addMemento(originator.storeInMemento());
				savedFiles++;
				currentArticle++;
				System.out.println("Saved Files " + savedFiles);
				btnUndo.setEnabled(true);
				System.out.println("Current article index: " + currentArticle + "\n");
			} else if(e.getSource() == btnUndo) {
				if(currentArticle >= 1) {
					currentArticle--;			
					String textInTextArea = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
					theArticle.setText(textInTextArea);
					btnRedo.setEnabled(true);
					System.out.println("Current article index: " + currentArticle + "\n");
				} else {
					btnUndo.setEnabled(false);
				}
			} else if(e.getSource() == btnRedo) {
				if(savedFiles > currentArticle) {
					currentArticle++;
					String textInTextArea = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
					theArticle.setText(textInTextArea);
					btnUndo.setEnabled(true);
					System.out.println("Current article index: " + currentArticle + "\n");
				} else {
					btnRedo.setEnabled(false);
				}
			}
		}
	}
	
}
