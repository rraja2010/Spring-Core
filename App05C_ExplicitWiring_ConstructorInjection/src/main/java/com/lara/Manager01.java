package com.lara;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager01 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);

		Person pr = (Person) bf.getBean("p1");

		System.out.println("===Person Details====");
		System.out.println(pr.getFirstName());
		System.out.println(pr.getAge());
		System.out.println(pr.getClass().getName());
		System.out.println(pr.getEucation());
		System.out.println(pr.getLoverName());
		System.out.println(pr.getMobileNo());
		System.out.println(Arrays.toString(pr.getMails()));
		System.out.println(pr.getWeight());
		System.out.println(pr.getProject());

		System.out.println("====Address Detail====");
		Address ad = (Address) bf.getBean("a1");
		System.out.println(ad.getHouseNo());
		System.out.println(ad.getStreetName());
		System.out.println(ad.getClass().getName());

		System.out.println("===The End====");
	}
}
