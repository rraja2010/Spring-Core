
package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager01 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Person p = (Person) bf.getBean("p1");
		System.out.println("===========================");

		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getAge());
		System.out.println(p.getClass().getName());
		System.out.println("done");
	}
}

/*

Here Spring frame work as per requirement it create the object for our class.
supplying the data to the SFW , Storing the data to the object and it itself manage the
life of the bean object very effectively.

*/