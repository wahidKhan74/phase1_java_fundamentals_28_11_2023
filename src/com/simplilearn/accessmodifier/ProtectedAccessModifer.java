package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.ExtendedHouse;

/**
 * This class demonstrate protected access modifier as max package level scope and outside the package require inheritance.
 * @author khanw
 */
public class ProtectedAccessModifer extends ExtendedHouse{

	public static void main(String[] args) {
		// create an object
		House house = new House();
		
		System.out.println("Name : " + house.name);
		System.out.println("No. of Room's : " + house.noOfRooms);
		System.out.println("No. of Kitechen's : " + house.noOfKitechen);
		
		System.out.println("-----------------");
		
		house.showDetails();
		
		// create an instance 
		ExtendedHouse extendedHouse = new ExtendedHouse();
		
		// System.out.println(extendedHouse.area); // The field ExtendedHouse.area is not visible
		// System.out.println(extendedHouse.price); // The field ExtendedHouse.price is not visible
		// extendedHouse.showAreaAndPrice(); // The field ExtendedHouse.showAreaAndPrice() is not visible
		System.out.println("-----------------");
		
		ProtectedAccessModifer accessModifer = new ProtectedAccessModifer();
		System.out.println(accessModifer.area); 
		System.out.println(accessModifer.price); 
		accessModifer.showAreaAndPrice();
	}
}

class House {
	
	protected String name = "White House";
	protected byte noOfRooms = 20;
	protected byte noOfKitechen = 5;
	protected byte noOfBalcony = 15;
	
	protected String showName() {
		return this.name;
	}
	
	protected void showDetails() {
		System.out.println(this.name + " has total "+this.noOfRooms + " rooms , "+this.noOfKitechen
				+ " kitchen and "+this.noOfBalcony + " balconines");
	}
	
	protected House() {}
}
