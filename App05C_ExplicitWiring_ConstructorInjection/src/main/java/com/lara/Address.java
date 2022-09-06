package com.lara;

public class Address {
	private String houseNo;
	private String streetName;

	public Address(String houseNo, String streetName) {
		this.houseNo = houseNo;
		this.streetName = streetName;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getStreetName() {
		return streetName;
	}
}
