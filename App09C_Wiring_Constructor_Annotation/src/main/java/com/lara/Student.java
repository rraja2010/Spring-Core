package com.lara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String firstName;
	private Address permanentAddress;

	@Autowired
	public Student(String firstName, @Qualifier(value = "ad") Address permanentAddress) {
		this.firstName = firstName;
		this.permanentAddress = permanentAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}
}
