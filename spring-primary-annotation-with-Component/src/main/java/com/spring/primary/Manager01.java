package com.spring.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.primary.config.AppConfig;
import com.spring.primary.service.MessageService;

public class Manager01 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageService messageService = context.getBean(MessageService.class);
		messageService.sendMsg();
		context.close();	
	}
}
