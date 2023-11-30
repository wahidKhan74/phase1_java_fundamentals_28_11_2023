package com.simplilearn.loop;

/**
 * This class demonstrate For Loop statement.
 * @author khanw
 */
public class ForLoop {

	public static void main(String[] args) {
		// For loop is used to iterate a part of the program several times.
		// The number of iteration is fixed, it is recommended to use for loop.

		// create a counter // for(initialization; condition; increment/decrement)
		for (int count = 1; count <= 10; count++) {
			System.out.println("Count : " + count);
		}
		
		System.out.println("----------------------");
		// create a reverse counter // for(initialization; condition; increment/decrement)
		for (int revCount = 10; revCount >= 1 ; revCount--) {
			System.out.println("Count : " + revCount);
		}
		
		
		
		System.out.println("----------------------");
		// infinity for loop
		for (int revCount = 10; true ; revCount--) {
			System.out.println("Count : " + revCount);
		}
		
//		for(;true;) {
//			System.out.println("Infinative For Loop");
//		}
		
	}

}
