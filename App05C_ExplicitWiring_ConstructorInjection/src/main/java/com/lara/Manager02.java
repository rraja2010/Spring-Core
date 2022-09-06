package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager02 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Test t1 = (Test) bf.getBean("t2");
		System.out.println(t1);
	}
}
