package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springframework.config.AppConfiguration;
import com.springframework.config.service.MessageService;
import com.springframework.config.serviceImp.EmailService;

public class Manager02 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageService messageService1 = applicationContext.getBean(EmailService.class);
		messageService1.sendMsg("Sending message by email-1");
		System.out.println("*************************************>"+messageService1);
		
		MessageService messageService2 = applicationContext.getBean(EmailService.class);
		messageService2.sendMsg("Sending message by email-2");
		System.out.println("*************************************>"+messageService2);
		
		MessageService messageService3 = applicationContext.getBean(EmailService.class);
		messageService3.sendMsg("Sending message by email-3");
		System.out.println("*************************************>"+messageService3);
		System.out.println("Done");
		
	}
}
/*
in case of prototype
OUTPUT
--SMSService()--
--EmailService()--
From EmailService@sendMsg
Sending message by email-1
*************************************>com.springframework.config.serviceImp.EmailService@4de4b452
--EmailService()--
From EmailService@sendMsg
Sending message by email-2
*************************************>com.springframework.config.serviceImp.EmailService@50b5ac82
--EmailService()--
From EmailService@sendMsg
Sending message by email-3
*************************************>com.springframework.config.serviceImp.EmailService@101952da
Done


In case of singleton
OUTPUT
--EmailService()--
--SMSService()--
From EmailService@sendMsg
Sending message by email-1
*************************************>com.springframework.config.serviceImp.EmailService@4de4b452
From EmailService@sendMsg
Sending message by email-2
*************************************>com.springframework.config.serviceImp.EmailService@4de4b452
From EmailService@sendMsg
Sending message by email-3
*************************************>com.springframework.config.serviceImp.EmailService@4de4b452
Done



*/