package com.simplilearn.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class demonstrate set collection
 * @author khanw
 */
public class SetDemo {

	public static void main(String[] args) {
		
		// Set is child interface in Collection, Set does not store duplicate elements
		// Implementation class : HashSet , LinkendHashSet, TreeSet.
		
		// set declaration
		Set<String> set1 = new HashSet<String>(); // HashSet allows unique elements + but no insertion order preserve.
		Set<String> set2 = new LinkedHashSet<String>(); // LinkedHashSet allows unique elements + insertion order preserve.
		Set<String> set3 = new TreeSet<String>();  // TreeSet allows unique elements + order data by asc or dec order.
	}
}
