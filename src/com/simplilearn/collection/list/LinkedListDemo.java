package com.simplilearn.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class demonstrate List List collection
 * 
 * @author khanw
 */
public class LinkedListDemo {

	public static void main(String[] args) {

		// list of cities
		List<String> listOfCities = new LinkedList<String>();

		// add cities
		listOfCities.add("New York");
		listOfCities.add("Los Ageles");
		listOfCities.add("California");
		listOfCities.add("Hawai");
		listOfCities.add("Mumbai");

		// print list
		System.out.println(listOfCities);

		// print index 3 value
		System.out.println("index 3 : " + listOfCities.get(3));

		System.out.println("-----------------");

		// iteration over list by iterator
		Iterator<String> itr = listOfCities.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------");
		// for loop with counter
		for (int index = 0; index < listOfCities.size(); index++) {
			System.out.println("The index : " + index + " and value : " + listOfCities.get(index));
		}

		System.out.println("-----------------");
		// enhance for loop
		for (String city : listOfCities) {
			System.out.println("The City : " + city);
		}
		
	}
}
