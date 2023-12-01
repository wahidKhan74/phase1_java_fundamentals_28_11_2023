package com.simplilearn.collection.list.employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Employee data list
 * 
 * @author khanw
 */
public class EmployeeList {

	public static void main(String[] args) {

		// create employee list
		List<Employee> employees = new LinkedList<Employee>();

		// add employee object
		employees.add(new Employee(1000, "John Doe", 50000));
		employees.add(new Employee(1001, "Mike Smith", 400233));
		employees.add(new Employee(1002, "Sangeetha V", 78000));
		employees.add(new Employee(1003, "Tharun Venkata", 56566));

		// print employee list
		System.out.println(employees);

		// print 2 index employee from list
		System.out.println(employees.get(2));

		System.out.println("------------------");
		// iteration over list by iterator
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------");
		// enhance for loop
		for (Employee emp : employees) {
			System.out.println(emp);
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