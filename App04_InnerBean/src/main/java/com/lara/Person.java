package com.lara;

public class Person {
	private String fname;
	private String address;
	private int age;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person [address=" + address + ",age=" + age + ", name=" + fname + "]";
	}
}
