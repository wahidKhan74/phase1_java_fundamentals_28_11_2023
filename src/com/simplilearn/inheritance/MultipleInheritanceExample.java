package com.simplilearn.inheritance;

/**
 * This class is used to demonstrate Multiple inheritance.
 * Multiple inheritance is not supported in java it leads to ambiguity
 * @author khanw
 */
public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
	}
}

// Super Class
class Swimmer {
	
	void swim() {
		System.out.println("I can swim");
	}
}

//Super Class
class Flyer  {
	
	void fly() {
		System.out.println("I can fly");
	}
}

//Sub Class   :: Class implementing multiple interfaces
//class Duck extends  Swimmer, Flyer{
//	
//	void fly() {
//		System.out.println("I can fly");
//	}
//}

class Duck extends  Swimmer{

	@Override
	void swim() {
		System.out.println("I am a duck and I can swim");
	}
}