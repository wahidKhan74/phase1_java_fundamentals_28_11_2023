package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * This class demonstrate List collection
 * @author khanw
 */
public class ListDemo {

	// List  -> Order collection of data with duplicates elements. Not thread safe collection
	// List (interface) ->  imp classes -> ArrayList, LinkedList , Vector , Stack
	public static void main(String[] args) {
		
		//list deceleration
		List<String> list1 =  new ArrayList<String>(); // Backed by dynamic array, read operations.
		List<String> list2 =  new LinkedList<String>(); // Backed by doubly linked list -> insert, update, delete
		
		List<String> list3 = new Vector<String>(); // thread safe collection -> legacy collection
		List<String> list4 = new Stack<String>();  // thread safe collection -> legacy collection
		
	}
}
