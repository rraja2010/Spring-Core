package com.lara;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		System.out.println("Person()---constructor");
	}

	public String getFirstName() {
		System.out.println("getFirstName");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setFirstName");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("getLastName");
		return lastName;

	}

	public void setLastName(String lastName) {
		System.out.println("setLastName");
		this.lastName = lastName;
	}

	public int getAge() {
		System.out.println("getAge");
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge");
		this.age = age;
	}
}
