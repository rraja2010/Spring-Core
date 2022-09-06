package com.lara;

public class Manager01 {
	public static void main(String[] args) {
		Student p1 = (Student) Util.getObject("s1");

		System.out.println(p1.getFirstName());

		Address ad = p1.getPermanentAddress();
		System.out.println(ad.getHouseNo());
		System.out.println(ad.getStreetName());
		System.out.println(ad.getClass().getName());
		System.out.println("done");
	}
}
