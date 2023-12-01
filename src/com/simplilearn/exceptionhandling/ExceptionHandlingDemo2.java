package com.simplilearn.exceptionhandling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		
		// call calculate 
		calcIntrest(30);
		calcIntrest(0);
		calcIntrest(40);
		
		System.out.println("--------------");
		strLengthCalculator("Today is a good day !");
		strLengthCalculator("");
		strLengthCalculator(null);
		strLengthCalculator("Hello EveryOne");
		
		System.out.println("--------------");
		multiConvertor("5000", 500);
		multiConvertor("Today is a good day", 500);
	}
	
	private static void calcIntrest(int intAmt ) {
		try {
			int balance = 3000;
			int total  = (balance / intAmt ) * 100;
			System.out.println("Total amount :: "+ total);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	
	private static void strLengthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("Result str lenght :: "+length);
		} catch (NullPointerException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
	
	private static void multiConvertor(String input, int number) {
		try {
			int result1 = Integer.parseInt(input);
			int result2 = 2000 / number;
			int result3 = input.length();
			System.out.println("Result1 :> "+result1);
			System.out.println("Result2 :> "+result2);
			System.out.println("Result3 :> "+result3);
		} catch (NumberFormatException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
