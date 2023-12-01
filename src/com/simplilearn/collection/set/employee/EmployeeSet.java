package com.simplilearn.collection.set.employee;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Employee data as set
 * 
 * @author khanw
 */
public class EmployeeSet {

	public static void main(String[] args) {

		// create a set of employees as linkedhashset
		Set<Employee> empSet = new LinkedHashSet<Employee>();

		// add employee object
		empSet.add(new Employee(1000, "John Doe", 50000));
		empSet.add(new Employee(1001, "Mike Smith", 400233));
		empSet.add(new Employee(1002, "Sangeetha V", 78000));
		empSet.add(new Employee(1003, "Tharun Venkata", 56566));
		
		System.out.println(empSet);
		
		System.out.println("-----------");
		Iterator<Employee> itr = empSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------");
		for (Employee emp : empSet) {
			System.out.println(emp.empId);
			System.out.println(emp.empName);
			System.out.println(emp.salary);
			System.out.println("------");
		}

	}
}

class Employee {

	public int empId;
	public String empName;
	public double salary;

	public Employee() {
	};

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee (empId=" + this.empId + ", empName=" + this.empName + ", salary= $" + this.salary + ")";
	};
}