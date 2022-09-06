package com.spring.primary.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.primary.service.MessageService;

public class AppMessageServiceConfigBean {
	
	@Autowired
	@Qualifier("messageFromTwitterMessageService")
	private MessageService messageService;
	
	public void getMessage() {
		 messageService.sendMsg();
	}
}
