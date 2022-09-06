package com.lara;

import java.util.List;

public class Student
{
	private String firstName;
	private Double weight;
	private List mails;

	public Student()
	{
		System.out.println("<<--Student object is created----->>");
	}

	public String getFirstName()
	{
		System.out.println("getFirstName");
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		System.out.println("setFirstName");
		this.firstName = firstName;
	}

	public Double getWeight()
	{
		System.out.println("getWeight");
		return weight;
	}

	public void setWeight(Double weight)
	{
		System.out.println("setWeight");
		this.weight = weight;
	}

	public List getMails()
	{
		System.out.println("getMails");
		return mails;
	}

	public void setMails(List mails)
	{
		System.out.println("setMails");
		this.mails = mails;
	}
}
