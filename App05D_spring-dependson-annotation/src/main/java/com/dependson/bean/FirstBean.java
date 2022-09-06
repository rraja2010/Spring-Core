package com.dependson.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	
	@Autowired
	private SecondBean secondBean;
	
	@Autowired
	private ThirdBean thirdBean;
	
	public FirstBean() {
		System.out.println("FirstBean Initialized via Constuctor");
	}
	
	public void populateBeans() {
		secondBean.display();
		thirdBean.display();
	}
}
/*
The @DependsOn annotation can force the Spring IoC container to initialize one or more beans 
	before the bean which is annotated by @DependsOn annotation.
*/
