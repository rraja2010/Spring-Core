package com.springframework.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserService {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public UserService() {
		System.out.println("---UserService()---");
	}
}
