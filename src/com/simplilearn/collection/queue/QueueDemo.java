package com.simplilearn.collection.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/**
 * This class demonstrate queue Queue is a data structure which works in first
 * in first out order.
 * 
 * @author khanw
 *
 */
public class QueueDemo {

	public static void main(String[] args) {

		// queue for bank user
		Queue<String> peopleQueue = new ArrayDeque<String>();

		// add elements in queue

		peopleQueue.add("John Smith");
		peopleQueue.add("Adam Smith");
		peopleQueue.add("Priyajit Bhattacharryya");
		peopleQueue.add("David Bakam");
		peopleQueue.add("Kim Sung");
		peopleQueue.add("Marry James");

		// print queue
		System.out.println(peopleQueue);

		// peek -> checking top element
		System.out.println("Head :> " + peopleQueue.peek());
		System.out.println("Head :> " + peopleQueue.element());

		System.out.println("---------------------");

		// remove element from queue ( head )
		String removeElement = peopleQueue.poll();
		System.out.println("Removed Element :> " + removeElement);
		System.out.println(peopleQueue);

		System.out.println("---------------------");
		// peek -> checking top element
		System.out.println("Head :> " + peopleQueue.peek());
		
		System.out.println("---------------------");
		Iterator<String> itr = peopleQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------");
		// iteration over
		for (String person : peopleQueue) {
			System.out.println(person);
		}
	}
}
