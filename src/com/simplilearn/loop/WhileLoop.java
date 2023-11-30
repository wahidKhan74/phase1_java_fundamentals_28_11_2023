package com.simplilearn.loop;

/**
 * This class demonstrate While Loop statement.
 * @author khanw
 */
public class WhileLoop {
	
	public static void main(String[] args) {
		
		// The while loop is considered as a repeating if statement. If the number of iteration is not fixed.
		// create a counter
		int count = 1;
		while(count<=10) {
			System.out.println("Count : "+ count);
			// breaking count
			count++;
		}
		
		System.out.println("----------------------");
		// reverse counter
		int revCount = 10;
		while(revCount>=1) {
			System.out.println("Count : "+ revCount);
			// breaking count
			revCount--;
		}
		
		System.out.println("----------------------");
		// infinity loop
		while(true) { 
			System.out.println("infinitive while loop");    
		}
	}

}
