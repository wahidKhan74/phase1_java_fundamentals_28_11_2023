package com.simplilearn.classdemo;

/**
 * This method demonstrate class , object and constructor
 * @author khanw
 */
public class TrainingApp {

	public static void main(String[] args) {
		
		// create object trainer
		Trainer trainer1 = new Trainer("John Doe", 30, "john@gmail.com", "Automation Test");
		Trainer trainer2 = new Trainer("Venkata", 30, "venkata@gmail.com", "Java Programming");
		Trainer trainer3 = new Trainer("Sasidhar", 30, "sasidhar@gmail.com", "QA Test");
		Trainer trainer4 = new Trainer("Akshata", 30, "akshata@gmail.com", "Java Programming");
		
		trainer1.introduce();
		trainer1.conductTraining();
		
		trainer2.introduce();
		trainer3.introduce();
		trainer4.introduce();
	}
}

class Trainer  {
	
	//data members
	String name;
	int age;
	String email;
	String expertise;
	
	// get method
	public String getName() {
		return name;
	}
	
	// other logical method
	public void introduce() {
		System.out.println("Hi, I'm " + this.name + ", a trainer with expertise in " + this.expertise + ".");
	}
	
	public void conductTraining() {
		System.out.println(this.name + " is conducting a training session.");
	}
	
	// default constructor 
	Trainer() {}
	
	// Parameterized constructor 
	Trainer(String name, int age, String email, String expertise) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.expertise = expertise;
	}
}