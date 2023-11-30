package com.simplilearn.inheritance;

/**
 * This class is used to demonstrate inheritance Hierarchical Inheritance
 * In Java does not allow is multiple inheritance where one class can inherit properties from more than one class.
 * It is known as the diamond problem.  
 * @author khanw
 */
public class EmployeeInheritanceExample {

	public static void main(String[] args) {

		 Manager manager = new Manager("Alice", 1001, 80000, "Sales");
		 Developer developer = new Developer("Bob", 2001, 65000, "Java");
		 Tester tester = new Tester("Sasidhar", 4001, 55000, "Selenium");
		 
		 //parent class method
		 manager.displayDetails();
		 System.out.println("---------");
		 developer.displayDetails();
		 System.out.println("---------");
		 tester.displayDetails();
		 
		 
		 System.out.println("---------");
		 manager.manageTeam();  // Method specific to Manager
		 
		 System.out.println("---------");
		 developer.code();  // Method specific to Developer
		 
		 System.out.println("---------");
		 tester.test();  // Method specific to Tester
	}
}

//Superclass Employee
class Employee {

	public String name;
	public int employeeID;
	public double salary;

	// Constructor
	public Employee(String name, int employeeID, double salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}

	// Method to display employee details
	public void displayDetails() {
		System.out.println("Employee Name: " + this.name);
		System.out.println("Employee ID: " + this.employeeID);
		System.out.println("Salary: $" + this.salary);
	}
}

class Manager extends Employee {

	public String department;

	// Constructor
	public Manager(String name, int employeeID, double salary, String department) {
		super(name, employeeID, salary);
		this.department = department;
	}
	
	// Method specific to Manager
    public void manageTeam() {
        System.out.println(this.name + " is managing the " + department + " department.");
    }
}

class Developer extends Employee {

	public String progLanguage;

	// Constructor
	public Developer(String name, int employeeID, double salary, String progLanguage) {
		super(name, employeeID, salary);
		this.progLanguage = progLanguage;
	}

	// Method specific to Developer
	public void code() {
		System.out.println(this.name + " is coding in " + this.progLanguage + ".");
	}
}

class Tester extends Employee {

	public String tool;

	// Constructor
	public Tester(String name, int employeeID, double salary, String tool) {
		super(name, employeeID, salary);
		this.tool = tool;
	}

	// Method specific to Tester
	public void test() {
		System.out.println(this.name + " is testing in " + this.tool + ".");
	}
}