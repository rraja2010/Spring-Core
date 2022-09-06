package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager02 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("beans.xml");

		BeanFactory bf = new XmlBeanFactory(cpr);

		Student s1 = (Student) bf.getBean("s1");
		Student s2 = (Student) bf.getBean("s1");
		Student s3 = (Student) bf.getBean("s1");
		Student s4 = (Student) bf.getBean("s1");

		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println("s3=" + s3);
		System.out.println("s4=" + s4);
		System.out.println("done");
	}
}

/*
 * by default the scope of the bean object is singleTon.
 */