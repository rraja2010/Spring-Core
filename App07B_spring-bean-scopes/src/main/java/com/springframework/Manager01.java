package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springframework.bean.UserService;
import com.springframework.config.AppConfiguration;

public class Manager01 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		UserService  userService = applicationContext.getBean(UserService.class);
		userService.setName("Singleton");
		System.out.println(userService.getName());
		
		UserService  userService1 = applicationContext.getBean(UserService.class);
		System.out.println(userService1.getName());
		
		UserService  userService2 = applicationContext.getBean(UserService.class);
		System.out.println(userService2.getName());
		
		UserService  userService3 = applicationContext.getBean(UserService.class);
		System.out.println(userService3.getName());
	}
}



/*
Output
---UserService()---
Singleton
Singleton
Singleton
Singleton


Default bean scope is singleTon
Only one time constructor has executed - we have made the request four times.

If scope is prototype
output

---UserService()---
Singleton
---UserService()---
null
---UserService()---
null
---UserService()---
null

Here four times constructor has been executed - means four different object has been created.
for the first object we have just set the values as Singleton - so that is getting printed.
rest other three object  - values are not being set - so getting null.
*/