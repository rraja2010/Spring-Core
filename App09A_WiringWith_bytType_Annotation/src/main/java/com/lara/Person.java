package com.lara;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String firstName;
	private Address permanentAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	@Autowired // by default it is byType
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}
