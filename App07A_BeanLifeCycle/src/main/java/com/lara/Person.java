package com.lara;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements DisposableBean, InitializingBean {
	private String firstName;
	private int age;

	public Person() {
		System.out.println("Person()");
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
		System.out.println("getFirsName()");
		return firstName;
	}

	public int getAge() {
		System.out.println("getAge()");
		return age;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("agterPropertiesSet()");
	}

	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

}
