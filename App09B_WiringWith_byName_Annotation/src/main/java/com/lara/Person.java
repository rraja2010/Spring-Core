package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

	@Autowired
	@Qualifier(value = "a1")
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}
