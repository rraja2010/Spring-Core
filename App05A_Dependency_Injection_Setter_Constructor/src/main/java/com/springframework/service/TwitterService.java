package com.springframework.service;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("From TwitterService@sendMsg");
		System.out.println(message);
	}

}
