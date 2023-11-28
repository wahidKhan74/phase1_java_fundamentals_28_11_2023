package com.simplilearn.typecasting;

import java.util.Scanner;

/**
 * This class demonstrate Numeric data conversion for explicit and implicit type cast Example.
 * @author khanw
 */
public class NumericDataConvertor {

	// Entry point
	public static void main(String[] args) {
		
		// step 1: Collect input from end user.
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------------------------------------");
		System.out.println(":: Welcome to Numeric data convertor ::	");
		System.out.println(":: Enter a integer number value ::	");
		System.out.println("------------------------------------------");
		int number = input.nextInt();
		
		System.out.println("Given Number : " + number);
		
		// step 2: Convert number into explicit and implicit type
		long bigValue = number;    // int -> long // implicit type cast
		float floatValue = number; // int -> float // implicit type cast
		double decimalValue = bigValue; // long -> double // implicit type cast
		
		byte byteValue = (byte) number; // int -> byte // Explicit type
		short shortValue = (short) floatValue;  // float -> short // Explicit type
		
		System.out.println(":: Interger to Other Type casted values ::");
		
		System.out.println("Byte Value : "+byteValue);
		System.out.println("Short Value : "+shortValue);
		System.out.println("Long Value : "+bigValue);
		System.out.println("Float Value : "+floatValue);
		System.out.println("Double Value : "+decimalValue);
		
	}
}
