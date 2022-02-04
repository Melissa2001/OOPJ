/***************************************
 * FILE        : Event Handling Activity
 * DESCRIPTION : Program to create a sign up form.
 * AUTHOR      : Melissa Manoj Thondoli
 * VERSION     : 1
 * DATE        : 04/02/22
 **********************************/

package OOPJ;

import java.awt.*;
import java.awt.event.*;

public class SignUpForm extends Frame implements ActionListener,WindowListener{
	
	TextField nameField = new TextField();
	TextField depField = new TextField();
	TextField semField = new TextField();
	
	
	Label name = new Label("NAME:");
	Label department = new Label("DEPARTMENT:");
	Label semester = new Label("SEMESTER:");
	Label batch = new Label("BATCH:");
	Label gender = new Label("GENDER:");
	
	CheckboxGroup genderCheck = new CheckboxGroup();
	Checkbox male = new Checkbox("Male",genderCheck,true);
	Checkbox female = new Checkbox("Female",genderCheck,true);
	Checkbox trans = new Checkbox("Transgender",genderCheck,true);
	
	Choice batchChoice = new Choice();
	
	Button submit = new Button("SUBMIT");
	
	SignUpForm(){
		setTitle("Sign-Up Form");
		setLayout(null);
		setVisible(true);
		setSize(900,400);
		
		nameField.setBounds(100,100,200,30);
	    depField.setBounds(100,200,200,30);
		semField.setBounds(100,300,200,30);
	
		
		add(nameField);
		add(depField);
		add(semField);
		
		
		name.setBounds(100,80,200,30);
		department.setBounds(100,180,200,30);
		semester.setBounds(100,280,200,30);
		gender.setBounds(500,80,200,30);
		batch.setBounds(500,200,200,30);
		
		add(name);
		add(department);
		add(semester);
		add(gender);
		add(batch);
		
		male.setBounds(500,120,100,30);
		female.setBounds(600,120,100,30);
		trans.setBounds(700,120,100,30);
		
		add(male);
		add(female);
		add(trans);
		
		batchChoice.setBounds(500,230,100,100);
		batchChoice.add("A");
		batchChoice.add("B");
		
		add(batchChoice);
		
		submit.setBounds(600,300,70,50);
		add(submit);
		
		submit.addActionListener(this);
		addWindowListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		System.out.print(name.getText());
		System.out.println(nameField.getText());
		System.out.print(department.getText());
		System.out.println(depField.getText());
		System.out.print(semester.getText());
		System.out.println(semField.getText());
		System.out.print(gender.getText());
		Checkbox check = genderCheck.getSelectedCheckbox();
		System.out.println(check.getLabel());
		System.out.print(batch.getText());
		System.out.print(batchChoice.getSelectedItem());
		
	}
	
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		dispose();
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String [] args) {
		new SignUpForm();
	}
}