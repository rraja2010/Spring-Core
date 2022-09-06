package com.lara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("===Context is Ready====");
		Test t1 = (Test) ac.getBean("t1");
		System.out.println("===Test Bean is Ready====");
		System.out.println(t1.getParam1());
		System.out.println(t1.getClass().getName());
		System.out.println("==done===");
	}
}
/*
====output====
Test()
setParma1()
===Context is Ready====
===Test Bean is Ready====
getParam1()
hello
com.lara.Test
==done===

ApplicationContext is the container it containing entire configuration content of beans.xml

while creating the object of ApplicationContext, first of all what ever bean class is configured
in the beans.xml file it will create that number of beans object.
i.e
if one bean class is available then it will create the one bean object.
if five bean class is available then it will create the five bean object.

after ward if it is setting value of all the bean class property(i.e attribute value) by calling the respective setter method.
then it internally calling the afterPropertySet() method then only settled data are available for uses purpose for the end
users.
*/