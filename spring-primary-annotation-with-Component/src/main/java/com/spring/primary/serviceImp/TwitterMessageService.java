package com.spring.primary.serviceImp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring.primary.service.MessageService;

@Primary
@Component
public class TwitterMessageService implements MessageService {
	@Override
	public void sendMsg() {
		System.out.println("TwitterMessageService Implementation here" );
	}
}
