package com.lara;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager01 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("beans.xml");

		BeanFactory bf = new XmlBeanFactory(cpr);

		Employee e = (Employee) bf.getBean("e1");

		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getAge());
		System.out.println(Arrays.toString(e.getMarks()));
		System.out.println("done done");
	}
}
