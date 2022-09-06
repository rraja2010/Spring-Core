package com.lara;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Manager02 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		Test t1 = ac.getBean(Test.class);
		System.out.println(t1.getParam1());
		System.out.println(t1.getParam2());
		System.out.println("done");
	}
}
