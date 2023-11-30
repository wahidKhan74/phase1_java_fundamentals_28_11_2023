package com.simplilearn.loop;

/**
 * This class demonstrate Do While Loop statement.
 * 
 * @author khanw
 */
public class DoWhileLoop {

	public static void main(String[] args) {

		// The do-while loop is used to iterate a part of the program repeatedly, until
		// the specified condition is true.
		// If the number of iteration is not fixed and you must have to execute the loop
		// at least once then use do while.

		// create a counter
		int count = 1;
		do {

			System.out.println("Count : " + count);
			// breaking condition
			count++;
		} while (count <= 10);

		
		System.out.println("----------------------");
		// create a reverse counter
		int revCount = 10;
		do {

			System.out.println("Count : " + revCount);
			// breaking condition
			revCount--;
		} while (revCount >= 1);
		
		
		System.out.println("----------------------");
		//infinity loop
		do {

			System.out.println("Infinative Do while");
		} while (true);
	}

}
