package com.simplilearn.typecasting;

/**
 * This class demonstrate Implicit TypeCast Example.
 * @author khanw
 */
public class ImplicitTypeCasting {
	
	// Implicit Type cast : When data type are compatible, automatically convertible.
	// Widening Type cast : Converts data from lower range value to higher range type.
	// byte -> short -> int -> long  -> float -> double.
	// size formula = -2^(n-1) to (2^(n-1)-1)  =>  is the formula to calculate the range of data types.
	// Where n = no.of.bits of the primitive data type.
	
	// Entry point	
	public static void main(String[] args) {
		
		byte smallCount = 100 ;  // 1 byte => -128 to 127 
		
		short shortCount = smallCount ; // 2 byte => -32768 to 32767  // Implicit Type cast
		
		int intCount = shortCount ;     //  4 bytes => -2,147,483,648 to 2,147,483,647  // Implicit Type cast
		
		long bigCount = intCount ;      // Implicit Type cast -> int => long
		
		float floatCount = bigCount;    // Implicit Type cast -> long => float
		
		double decimalCount = bigCount; // Implicit Type cast -> long => double
		
		double decimalCount2 = floatCount; // Implicit Type cast -> float => double
		
		System.out.println("Byte count : "+ smallCount);
		System.out.println("Integer count : "+ intCount);
		System.out.println("Short count : "+ shortCount);
		System.out.println("Long count : "+ bigCount);
		System.out.println("Float count : "+ floatCount);
		System.out.println("Doube count 1 : "+ decimalCount);
		System.out.println("Double count 2 : "+ decimalCount2);
	}
	
}
