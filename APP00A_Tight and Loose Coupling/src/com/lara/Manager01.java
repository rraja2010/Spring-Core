package com.lara;

public class Manager01 {
	public static void main(String[] args) {
		Traveller m1 = new Traveller();
		Car1 c1 = new Car1();
		m1.setV(c1);
		m1.startJourney();
		System.out.println("----------------");
		Bike b1 = new Bike();
		m1.setV(b1);
		m1.startJourney();
	}
}
/*
In above example, spring container will inject either Car1 object or Bike object into the Manager01
by calling setter method, So if Car1 object is replaced with Bike then no changes are required in 
Traveler class, this means there is loose coupling between Traveler and Vehicle object.
*/