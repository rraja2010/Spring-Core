package com.springframework.service;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("From EmailService@sendMsg");
		System.out.println(message);
	}

}
