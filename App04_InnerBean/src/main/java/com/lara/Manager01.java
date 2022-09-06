package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Customer cust = (Customer) ac.getBean("cus");
		System.out.println(cust);
	}
}
