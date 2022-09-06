package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Manager01 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);

		Person p1 = (Person) bf.getBean("p1");

		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());
		System.out.println(p1.getClass().getName());
		System.out.println("=======================");

		Address ad = p1.getPermananentAddress();
		System.out.println(ad.getHouseNo());
		System.out.println(ad.getStreetName());
		System.out.println(ad.getClass().getName());

		System.out.println("========================");
		System.out.println("done");
	}
}
