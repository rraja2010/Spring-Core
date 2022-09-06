package com.lara;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private String firstName;
	private int age;
	private Double weight;
	private String[] mails;
	private List mobileNo;
	private Set loverName;
	private Map eucation;
	private Properties project;

	private Address permanentAddress;

	public Person(String firstName, int age, Double weight, String[] mails, List mobileNo, Set loverName, Map eucation,
			Properties project, Address permanentAddress) {
		this.firstName = firstName;
		this.age = age;
		this.weight = weight;
		this.mails = mails;
		this.mobileNo = mobileNo;
		this.loverName = loverName;
		this.eucation = eucation;
		this.permanentAddress = permanentAddress;
		this.project = project;

	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public Double getWeight() {
		return weight;
	}

	public String[] getMails() {
		return mails;
	}

	public List getMobileNo() {
		return mobileNo;
	}

	public Set getLoverName() {
		return loverName;
	}

	public Map getEucation() {
		return eucation;
	}

	public Properties getProject() {
		return project;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}
}
