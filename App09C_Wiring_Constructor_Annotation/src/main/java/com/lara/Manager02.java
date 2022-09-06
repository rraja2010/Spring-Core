package com.lara;

public class Manager02 {
	public static void main(String[] args) {
		Employee em = (Employee) Util.getObject("e1");
		System.out.println(em.getFirstName());

		Address add = em.getPermanentAddress();
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		System.out.println(add.getClass().getName());
		System.out.println("done");
	}
}
