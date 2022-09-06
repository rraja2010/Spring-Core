package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springframework.config.AppConfiguration;
import com.springframework.constructor.ConstructorBasedInjection;
import com.springframework.field.FieldBasedInjection;
import com.springframework.setter.SetterBasedInjection;

public class Manager03 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ConstructorBasedInjection  constructorBasedInjection = applicationContext.getBean(ConstructorBasedInjection.class);
		constructorBasedInjection.processMsg("EmailService message sending ");
	}
}

//Constructor Based Injection call