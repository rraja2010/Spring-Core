package com.springframework.config.serviceImp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.springframework.config.service.MessageService;

@Service
//@Scope("prototype")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmailService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("From EmailService@sendMsg");
		System.out.println(message);
	}
	
	public EmailService() {
		System.out.println("--EmailService()--");
	}

}
