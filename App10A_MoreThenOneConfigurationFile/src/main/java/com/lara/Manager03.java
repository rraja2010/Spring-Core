package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager03 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "config1.xml", "config2.xml" });

		Person p1 = ac.getBean("p1", Person.class);
		System.out.println(p1.getFirstName());

		Employee em = ac.getBean("e1", Employee.class);
		System.out.println(em.getLastName());
		System.out.println("done");
	}
}
/*
Here no need to downcast
if the getBean(-,-) 2nd argument is Pojo class type then no need to downcast

*/