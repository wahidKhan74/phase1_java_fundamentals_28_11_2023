package com.simplilearn.typecasting;

/**
 * This class demonstrate Explicit TypeCast Example.
 * @author khanw
 */
public class ExplicitTypeCast {

	// Explicit type cast : When type are not compatible, does not happen automatically conversion
	// Narrowing : Converts data of incompatible type, convert from higher range value to lower range value.
	// double => float => long => int => short => byte.
	
	// Entry point	
	public static void main(String[] args) {
		
		double accBalance = 100.4545d;   // 8 byte => decimal point value
		
		long bigBalance = (long) accBalance; // 8 byte => whole number value // Narrowing => double -> long
		
		int intBalance = (int) accBalance; // Narrowing => double -> int
		
		short shortBalance = (short) bigBalance;  // Narrowing => long -> short
		
		byte byteBalance = (byte) accBalance; // Narrowing => double -> byte
		
		
		System.out.println("Acount Balance (double) : "+ accBalance);
		System.out.println("Acount Balance (long) : "+ bigBalance);
		System.out.println("Acount Balance (int) : "+ intBalance);
		System.out.println("Acount Balance (short) : "+ shortBalance);
		System.out.println("Acount Balance (byte) : "+ byteBalance);
		
	}
}
