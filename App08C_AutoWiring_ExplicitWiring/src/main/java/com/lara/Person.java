package com.lara;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	private Address permananentAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getPermananentAddress() {
		return permananentAddress;
	}

	public void setPermananentAddress(Address permananentAddress) {
		this.permananentAddress = permananentAddress;
	}

}
