package com.lara;

public class Tight {
	public static void main(String[] args) {
		Car c = new Car();
		c.move();
	}
}

class Car {
	void move() {
		System.out.println("------this is move() method-------");
	}
}
/*
In the above example, Tight object is depends on car object.
So Tight class creating an object of Car class inside it

If the other class object is created in the dependent class
[ like Car class object in Tight class ], there exist tight coupling,
i.e. if method in car object is changed then we need to do the changes in the Tight class too 
so its the tight coupling between Tight and Car class objects
*/