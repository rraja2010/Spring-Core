package com.spring.primary.serviceImp;

import org.springframework.stereotype.Component;

import com.spring.primary.service.MessageService;

@Component
public class EmailMessageService implements MessageService {

	@Override
	public void sendMsg() {
		System.out.println("EmailMessageService Implementation here");
	}
}
