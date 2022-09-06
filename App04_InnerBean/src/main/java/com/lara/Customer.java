package com.lara;

public class Customer {
	private Person person;

	public Customer() {
		System.out.println("Customer()");
	}

	public Customer(Person person) {
		this.person = person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String toString() {
		return "Customer [person=" + person + "]";
	}
}
