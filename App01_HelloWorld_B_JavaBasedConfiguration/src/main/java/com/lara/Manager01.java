
package com.lara;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager01 {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  context = 
					new AnnotationConfigApplicationContext(AppConfig.class);
		Person p = (Person) context.getBean("getPersonDetails");
        context.close();
		
		System.out.println("===========================");

		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getAge());
		System.out.println(p.getClass().getName());
		System.out.println("done");
	}
}