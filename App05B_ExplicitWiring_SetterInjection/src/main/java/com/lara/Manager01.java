package com.lara;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager01 {
	public static void main(String[] args) {
		ClassPathResource crp = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(crp);

		Person pr = (Person) bf.getBean("p1");

		System.out.println("==Person Detail====");
		System.out.println(pr.getFirstName());
		System.out.println(pr.getAge());
		System.out.println(pr.getClass().getName());
		System.out.println(pr.getEucation());
		System.out.println(pr.getLoverName());
		System.out.println(pr.getMobileNo());
		System.out.println(pr.getProject());
		System.out.println(Arrays.toString(pr.getMails()));

		System.out.println("===Person Address Detail=====");

		Address ad = pr.getPermanentAddress();
		System.out.println(ad.getHouseNo());
		System.out.println(ad.getStreetName());
		System.out.println(ad.getClass().getName());

		System.out.println("===The End====");

	}
}
