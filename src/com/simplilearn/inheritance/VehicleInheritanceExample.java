package com.simplilearn.inheritance;

/**
 * This class is used to demonstrate inheritance
 * Single Inheritance
 * @author khanw
 */
public class VehicleInheritanceExample {

	public static void main(String[] args) {

		Car ferrari = new Car(4, 4, "Ferrari 488", "Ferrari", "488 GTB", 2023);
		
		ferrari.describe();
		ferrari.drive();
	}
}

//Superclass Vehicle
class Vehicle {

	public String name;
	public String brand;
	public String model;
	public int year;

	// Constructor
	public Vehicle(String name, String brand, String model, int year) {
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

class Car extends Vehicle {
	
	public int numOfWheels;
	public int numOfDoor;
	
	// 
	public Car(int numOfWheels,int numOfDoor, String name, String brand, String model, int year) {
		 super(name, brand, model, year);  // initialize parent class constructor
		 this.numOfDoor = numOfDoor;
		 this.numOfWheels = numOfWheels;
	}
	
	// Method specific to Car
    public void drive() {
        System.out.println("The " + this.brand + " " + this.model + " is being driven.");
    }
}