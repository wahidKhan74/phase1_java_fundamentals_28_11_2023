package com.simplilearn.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class demonstrate LinkedHashSet collection
 * 
 * @author khanw
 */
public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		Set<String> setOfUniqueBrands = new LinkedHashSet<String>();
		
		// insert data elements
		setOfUniqueBrands.add("NIKE");
		setOfUniqueBrands.add("ADIDAS");
		setOfUniqueBrands.add("FILA");
		setOfUniqueBrands.add("ADIDAS");
		setOfUniqueBrands.add("NIKE");
		setOfUniqueBrands.add("PUMA");
		setOfUniqueBrands.add("ADIDAS");
		
		//print set
		System.out.println(setOfUniqueBrands);
		
		System.out.println("-------------------");
		// set iteration with iterator
		Iterator<String> itr = setOfUniqueBrands.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------");
		// set iteration with for each
		for(String brand: setOfUniqueBrands) {
			System.out.println("The Brand :: "+brand);
		}
	}
}
