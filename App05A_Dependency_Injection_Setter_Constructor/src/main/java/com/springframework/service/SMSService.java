package com.springframework.service;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("From SMSService@sendMsg");
		System.out.println(message);
	}

}
