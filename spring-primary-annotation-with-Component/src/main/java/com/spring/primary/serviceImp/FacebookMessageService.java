package com.spring.primary.serviceImp;

import org.springframework.stereotype.Component;

import com.spring.primary.service.MessageService;

@Component
public class FacebookMessageService implements MessageService {
	@Override
	public void sendMsg() {
		System.out.println("FacebookMessageService implementation here");
	}
}
