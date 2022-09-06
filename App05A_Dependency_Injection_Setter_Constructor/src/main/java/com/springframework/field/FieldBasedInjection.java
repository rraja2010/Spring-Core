package com.springframework.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springframework.service.MessageService;

@Component
public class FieldBasedInjection {
	
	    @Autowired
	    @Qualifier("SMSService")
		private MessageService messageService;

		public void processMsg(String message) {
			messageService.sendMsg(message);
		}
}
