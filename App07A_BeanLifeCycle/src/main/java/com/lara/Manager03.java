package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager03 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("====Contex is Ready======");

		Student st = (Student) ac.getBean("s1");
		System.out.println("===student is Ready===");
		System.out.println(st.getFirstName());
		System.out.println(st.getAge());
		System.out.println("===========================");
		ac.registerShutdownHook();
		System.out.println("===End of Game====");
	}
}
