package com.lara;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager01
{
	public static void main(String[] args)
	{
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		System.out.println("--------------------------------------");
		
		Student s1 = (Student)bf.getBean("s1");
		
		System.out.println(s1.getFirstName());
		System.out.println(s1.getMails());
		
		System.out.println("---------------------------------------");
	}
}
