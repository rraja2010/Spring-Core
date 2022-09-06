package com.amit.vehicle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager01 {
	public static void main(String[] args) {
		ClassPathResource crp = new ClassPathResource("carOwner.xml");
		BeanFactory bf = new XmlBeanFactory(crp);

		Owner owner = (Owner) bf.getBean("owner");

		System.out.println("==Owner Detail====");
		System.out.println(owner.getPersonName());
		System.out.println(owner.getPersonId());

		System.out.println("===Owner Vehicle Details=====");

		Car car = owner.getCar();
		System.out.println(car.getCarId());
		System.out.println(car.getCarName());
		System.out.println(car.getCc() +" Cc");
		System.out.println(car.getClass().getName());

		System.out.println("===The End====");

	}
}
