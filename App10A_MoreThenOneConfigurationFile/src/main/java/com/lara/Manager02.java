package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager02 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "config1.xml", "config2.xml" });

		Person p1 = (Person) ac.getBean("p1");
		System.out.println(p1.getFirstName());

		Employee em = (Employee) ac.getBean("e1");
		System.out.println(em.getLastName());
		System.out.println("done");
	}
}
