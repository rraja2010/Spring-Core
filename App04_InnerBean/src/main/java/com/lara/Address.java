package com.lara;

public class Address// independent class
{
	private String houseNo;
	private String streetName;
	private String city;
	private String state;

	public Address() {
		System.out.println("Address()");
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return "houseNo:" + houseNo + "," + "streetName:" + streetName + "," + "city:" + city + "," + "state:" + state;
	}
}
