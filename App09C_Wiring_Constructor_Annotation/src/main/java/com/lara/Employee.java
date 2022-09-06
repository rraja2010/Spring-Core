package com.lara;

import javax.annotation.Resource;

public class Employee
{
	private String firstName;
	private Address permanentAddress;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public Address getPermanentAddress()
	{
		return permanentAddress;
	}
	@Resource(name="ad")
	public void setPermanentAddress(Address permanentAddress)
	{
		this.permanentAddress = permanentAddress;
	}

}
/*
Explicit wiring
Here permanentAddress is the attribute of Employee class getting the value
form Address class bean id ="ad 

*/