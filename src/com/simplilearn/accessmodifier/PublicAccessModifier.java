package com.simplilearn.accessmodifier;

/**
 * This class demonstrate public access modifier as widest scope overall.
 * @author khanw
 */
public class PublicAccessModifier {
	
	public static void main(String[] args) {
		
		// create an object
		Park park = new Park();
		
		System.out.println(park.title);
		System.out.println(park.statuesCount);
		
		System.out.println("---------------");
		
		park.showDetails();
		park.showStatues();
		
	}

}

class Park {
	
	//public data members
	public String title = "Public Health Center Park";
	public int chairCount = 100;
	public short statuesCount = 30;
	public byte games = 10;
	
	// public methods 
	public void showDetails() {
		System.out.println(this.title + " has chair count : "+ this.chairCount +" and statues are : "+this.statuesCount);
	}
	public void showStatues() {
		System.out.println(this.title + " has total "+this.statuesCount +" statues.");
	}
	
	public Park() { };
}