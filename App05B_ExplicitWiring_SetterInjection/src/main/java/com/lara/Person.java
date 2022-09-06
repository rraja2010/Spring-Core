package com.lara;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

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

	public Person() {
	}

	/**
	 * This constructor is used for @Autowired on constructor
	 * 
	 * @param deptBean
	 */
	@Autowired
	public Person(Address permanentAddress) {
		System.out.println("*** Autowiring by using @Autowire annotation on constructor of Perosn class***");
		this.permanentAddress = permanentAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String[] getMails() {
		return mails;
	}

	public void setMails(String[] mails) {
		this.mails = mails;
	}

	public List getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(List mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Set getLoverName() {
		return loverName;
	}

	public void setLoverName(Set loverName) {
		this.loverName = loverName;
	}

	public Map getEucation() {
		return eucation;
	}

	public void setEucation(Map eucation) {
		this.eucation = eucation;
	}

	public Properties getProject() {
		return project;
	}

	public void setProject(Properties project) {
		this.project = project;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}
