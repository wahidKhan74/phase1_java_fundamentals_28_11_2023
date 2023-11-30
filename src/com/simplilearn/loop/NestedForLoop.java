package com.simplilearn.loop;

/**
 * This class demonstrate Nested For Loop statement.
 * 
 * @author khanw
 *
 */
public class NestedForLoop {

	public static void main(String[] args) {

		// outer for
		for (int oIndex = 1; oIndex <= 2; oIndex++) {
			// System.out.println( oIndex);
			// nested for
			for (int iIndex = 1; iIndex <= 2; iIndex++) {
				System.out.println(oIndex + "   " + iIndex);
			}
		}

		System.out.println("------------");
		// outer for
		for (int oIndex = 1; oIndex <= 5; oIndex++) {
			// System.out.println( oIndex);
			// nested for  : only for if inner index is smaller and equal to outer index.
			for (int iIndex = 1; iIndex <= oIndex; iIndex++) {
				System.out.println(oIndex + "   " + iIndex);
			}
		}
		
		
		System.out.println("------------");
		// Pyramid 
		for (int oIndex = 1; oIndex <= 5; oIndex++) {
			// System.out.println( oIndex);
			// nested for  : only for if inner index is smaller and equal to outer index.
			for (int iIndex = 1; iIndex <= oIndex; iIndex++) {
				System.out.print("* ");
			}
			System.out.println();  // new line
		}
		
		System.out.println("------------");
		// Rever Pyramid 
		for (int oIndex = 1; oIndex <= 5; oIndex++) {
			// System.out.println( oIndex);
			// nested for  : only for if inner index is smaller and equal to outer index.
			for (int iIndex = 5; iIndex >= oIndex; iIndex--) {
				System.out.print("* ");
			}
			System.out.println();  // new line
		}
	}
}
