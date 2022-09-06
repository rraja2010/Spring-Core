package com.lara;

public class Address {
	private String houseNo;
	private String streetName;
	private String city;
	private String state;

	public Address() {
		System.out.println("Address()");
	}

	public Address(String houseNo, String streetName, String city, String state) {
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
}
