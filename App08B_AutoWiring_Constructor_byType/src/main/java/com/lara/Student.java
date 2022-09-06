package com.lara;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private double weight;

	private Address permanentAddress;

	public Student(String firstName, String lastName, int age, double weight, Address add) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.permanentAddress = add;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("First Name:" + firstName + "\n");
		sb.append("Last Name:" + lastName + "\n");
		sb.append("Age:" + age + "\n");
		sb.append("Weight:" + weight);
		if (permanentAddress != null) {
			sb.append("\nHouseNo:" + permanentAddress.getHouseNo());
			sb.append("\nStreetName:" + permanentAddress.getStreetName());
			sb.append("\nCity:" + permanentAddress.getCity());
			sb.append("\nState:" + permanentAddress.getState());
		} else {
			sb.append("\n permanentAddress:null");
		}
		return sb.toString();
	}
}
