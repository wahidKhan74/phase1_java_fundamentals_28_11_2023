package com.simplilearn.accessmodifier;

/**
 * This class demonstrate private access modifier as limited scope to a class
 * @author khanw
 */
public class PrivateAccessModifier {

	public static void main(String[] args) {
		
		// create an account object
		BankAccount account = new BankAccount();
		
		// access private data member
		// account.accNo; // The field BankAccount.accNo is not visible
		// account.accBalance; // The field BankAccount.accBalance is not visible
		// account.fullName; // The field BankAccount.accBalance is not visible
		// account.showEmail();  // The method showEmail() from the type BankAccount is not visible
		
		// public methods
		account.showName();
		account.showBalance();
	}
}

class BankAccount {
	
	// data members
	private long accNo = 349583348;
	private double accBalance = 45454.454d;
	private String fullName = "Harika Dodda";
	private String email = "harika@gmail.com";
	
	// methods
	private String showEmail() {
		return this.email;
	}
	
	public void showBalance() {
		System.out.println("The Account : " + this.accNo + " has balance : $"+this.accBalance);
	}
	
	public void showName() {
		System.out.println("The Account : " + this.accNo + " blongs to : "+this.fullName);
	}
	
	public BankAccount() { }
	
	// private BankAccount() { }  // Private Constructor based class can not be instantiated.
	
	
}