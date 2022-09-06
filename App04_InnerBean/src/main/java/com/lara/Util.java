package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Util {
	private static BeanFactory bf = null;

	static {
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		bf = new XmlBeanFactory(cpr);
	}

	public static Object getBean(String id) {
		return bf.getBean(id);
	}
}
