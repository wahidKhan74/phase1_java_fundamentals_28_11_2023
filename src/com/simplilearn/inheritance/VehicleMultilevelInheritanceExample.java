package com.simplilearn.inheritance;

/**
 * This class is used to demonstrate inheritance Multi Level Inheritance
 * 
 * @author khanw
 */
public class VehicleMultilevelInheritanceExample {

	public static void main(String[] args) {

		SportsCar ferrari = new SportsCar( 4, 4, "Ferrari 488", "Ferrari", "488 GTB", 2023, true);

		ferrari.describe();  // parent class
		ferrari.drive();     // sub class
		ferrari.isTurbo();   // sub sub class
	}
}

//Superclass Vehicle
class MVehicle {

	public String name;
	public String brand;
	public String model;
	public int year;

	// Constructor
	public MVehicle(String name, String brand, String model, int year) {
		super();
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// Method to describe the vehicle
	public void describe() {
		System.out.println("This is " + this.name + " a " + this.year + " " + this.brand + " " + this.model + ".");
	}
}

//Subclass Car
class MCar extends MVehicle {

	public int numOfWheels;
	public int numOfDoor;

	//
	public MCar(int numOfWheels, int numOfDoor, String name, String brand, String model, int year) {
		super(name, brand, model, year); // initialize parent class constructor
		this.numOfDoor = numOfDoor;
		this.numOfWheels = numOfWheels;
	}

	// Method specific to Car
	public void drive() {
		System.out.println("The " + this.brand + " " + this.model + " is being driven.");
	}
}

//Subclass SportsCar
class SportsCar extends MCar {

	public boolean turbo;

	//
	public SportsCar(int numOfWheels, int numOfDoor, String name, String brand, String model, int year, boolean turbo) {
		super(numOfWheels, numOfDoor, name, brand, model, year); // initialize parent class constructor
		this.turbo = turbo;
	}

	// Method specific to Car
	public void isTurbo() {
		System.out.println("The " + this.name + ", " + this.model + " is turbo car.");
	}
}