package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Util {
	private static ClassPathXmlApplicationContext ac = null;

	static {
		ac = new ClassPathXmlApplicationContext("beans.xml");
	}

	public static Object getObject(String id) {
		return ac.getBean(id);
	}
}
