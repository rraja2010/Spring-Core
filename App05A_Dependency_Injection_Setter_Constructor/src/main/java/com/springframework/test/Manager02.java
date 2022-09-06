package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springframework.config.AppConfiguration;
import com.springframework.field.FieldBasedInjection;
import com.springframework.setter.SetterBasedInjection;

public class Manager02 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		SetterBasedInjection setterBasedInjection = applicationContext.getBean(SetterBasedInjection.class);
		setterBasedInjection.processMsg("twitter message sending ");
	}
}

//Setter Based Injection call