package com.lara;

public class Student {
	private String firstName;
	private int age;

	public Student() {
		System.out.println("Student()");
	}

	public void setFirstName(String firstName) {
		System.out.println("setFirstName()");
		this.firstName = firstName;
	}

	public void setAge(int age) {
		System.out.println("setAge()");
		this.age = age;
	}

	public String getFirstName() {
		System.out.println("getFirstName()");
		return firstName;
	}

	public int getAge() {
		System.out.println("getAge()");
		return age;
	}

	public void init() {
		System.out.println("init()");
	}

	public void destroy() {
		System.out.println("destroy()");
	}
}
