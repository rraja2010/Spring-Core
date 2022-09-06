package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager02 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("===Application Context is Ready");

		Person pr = (Person) ac.getBean("p1");

		System.out.println("===Person is ready=====");

		System.out.println(pr.getFirstName());
		System.out.println(pr.getAge());
		System.out.println(pr.getClass().getName());
		System.out.println("==============================");
		ac.registerShutdownHook();
		System.out.println("=====The end======");
	}
}
/*
Person()
setFirstName()
setAge()
agterPropertiesSet()
===Application Context is Ready
===Person is ready=====
getFirsName()
amit
getAge()
25
com.lara.Person
==============================
=====The end======
destroy()

first constructor is executed i.e one Person object is create then it is calling all the setter 
method of available properties. After all the properties initialize then frame work is calling 
afterPropertiesSet() method.
it is the call back method.
After executing afterPropertiesSet() method then only setter data is available for uses purpose to 
the end users

when ever object is removing from the container automatic destroy() method is called by the frame work.
 
*/