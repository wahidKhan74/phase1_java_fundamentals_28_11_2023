package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class demonstrate Array List collection
 * @author khanw
 */
public class ArrayListDemo {

	public static void main(String[] args) {

		// list of companies
		List<String> listOfCompanies = new ArrayList<String>();

		// add data in list
		listOfCompanies.add("MPHASIS");
		listOfCompanies.add("DELL");
		listOfCompanies.add("CISCO");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("GOOGLE");
		listOfCompanies.add("FACEBOOK");
		listOfCompanies.add("AMAZON");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("FACEBOOK");
		// listOfCompanies.addAll(listOfCompanies); // multiple value

		// print list
		System.out.println(listOfCompanies);

		// print data from index 4 
		System.out.println("Index : 4  :> "+ listOfCompanies.get(4));
		
		System.out.println("-----------------");
		
		// iteration over list by iterator
		Iterator<String> itr = listOfCompanies.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------");
		// for loop with counter
		for (int index = 0; index < listOfCompanies.size(); index++) {
			System.out.println("The index : " + index + " and value : " + listOfCompanies.get(index));
		}
		
		System.out.println("-----------------");
		// enhance for loop
		for(String company : listOfCompanies) {
			System.out.println("The Company : "+company);
		}

	}
}
