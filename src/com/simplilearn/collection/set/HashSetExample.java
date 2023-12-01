package com.simplilearn.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * This class demonstrate HashSet collection
 * 
 * @author khanw
 */
public class HashSetExample {

	public static void main(String[] args) {

		// create a list of unique companies
		Set<String> companies = new HashSet<String>();

		// add companines
		companies.add("MPHASIS");
		companies.add("FACEBOOK");
		companies.add("MPHASIS");
		companies.add("AMAZON");
		companies.add("GOOGLE");
		companies.add("SIMPLILEARN");

		// print set
		System.out.println(companies);

		// remove element
		companies.remove("GOOGLE");
		System.out.println(companies);

		System.out.println("-------------");
		// set iteration with iterator
		Iterator<String> itr = companies.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------");
		// enhance for loop
		for(String company : companies) {
			System.out.println("The Company : "+company);
		}
	}
}
