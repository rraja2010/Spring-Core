package com.lara;

public class Manager02 {
	public static void main(String[] args) {
		Employee em = (Employee) Util.getBean("emp");
		System.out.println(em.getFirstName());
		Address ad = em.getPermanentAddress();
		System.out.println(ad.getHouseNo());
		System.out.println(ad.getCity());
		System.out.println(ad.getStreetName());
		System.out.println(ad.getState());
		System.out.println("===============");
		System.out.println(em);
	}
}
