package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Manager01 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("===Context is Ready=======");
		Book b1 = (Book) ac.getBean("b1");
		System.out.println("===Bean Object is Ready=====");
		System.out.println(b1.getAuthor());
		System.out.println(b1.getTitle());
		System.out.println("============================");
		ac.registerShutdownHook();
		System.out.println("===The End====");

	}
}
