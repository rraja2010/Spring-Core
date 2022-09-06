package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springframework.config.AppConfiguration;
import com.springframework.field.FieldBasedInjection;
import com.springframework.setter.SetterBasedInjection;

public class Manager01 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FieldBasedInjection  fieldBasedInjection = applicationContext.getBean(FieldBasedInjection.class);
		fieldBasedInjection.processMsg("SMSService message sending ");
	}
}

//Field Based Injection call