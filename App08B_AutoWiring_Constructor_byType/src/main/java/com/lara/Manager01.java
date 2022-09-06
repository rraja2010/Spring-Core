package com.lara;

public class Manager01 {
	public static void main(String[] args) {
		Student st = (Student) Util.getBean("s1");

		System.out.println(st.getFirstName());
		System.out.println(st.getLastName());
		System.out.println(st.getAge());
		System.out.println(st.getWeight());

		Address ad = st.getPermanentAddress();

		System.out.println(ad.getHouseNo());
		System.out.println(ad.getStreetName());
		System.out.println(ad.getCity());
		System.out.println(ad.getState());

	}
}
