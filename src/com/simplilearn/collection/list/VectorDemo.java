package com.simplilearn.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * This class demonstrate Vector List collection
 * 
 * @author khanw
 */
public class VectorDemo {

	public static void main(String[] args) {

		// list of cities
		List<String> listOfFruits = new LinkedList<String>(); // to store string collection
		List<Integer> listOfNumbers  = new Vector<Integer>(); // to store int collection
		List<Double> listOfPrice  = new Vector<Double>();     // to store double collection
		
		// add cities
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Mango");
		listOfFruits.add("Kiwi");

		// print list
		System.out.println(listOfFruits);

		// print index 3 value
		System.out.println("index 3 : " + listOfFruits.get(3));

		System.out.println("-----------------");

		// iteration over list by iterator
		Iterator<String> itr = listOfFruits.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------");
		// for loop with counter
		for (int index = 0; index < listOfFruits.size(); index++) {
			System.out.println("The index : " + index + " and value : " + listOfFruits.get(index));
		}

		System.out.println("-----------------");
		// enhance for loop
		for (String city : listOfFruits) {
			System.out.println("The Fruit : " + city);
		}
		
	}
}
