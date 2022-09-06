package com.lara;

public class Employee {
	private String firstName;
	private Address permanentAddress;

	public Employee() {
		System.out.println("Employee()");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String toString() {
		return "first Name:" + firstName + "," + "[" + permanentAddress + "]";
	}
}
