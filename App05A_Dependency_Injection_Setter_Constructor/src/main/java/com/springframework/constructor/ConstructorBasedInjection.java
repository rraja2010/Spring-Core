package com.springframework.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springframework.service.MessageService;

@Component
public class ConstructorBasedInjection {

	private MessageService messageService;
	
	@Autowired 
	public ConstructorBasedInjection(@Qualifier("EmailService")
	MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
