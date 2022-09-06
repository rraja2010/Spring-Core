package com.spring.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.primary.bean.Author;
import com.spring.primary.config.AuthConfig;

public class Manager02 {
	public static void main(String[] args) {
		 
        ApplicationContext ac = new AnnotationConfigApplicationContext(AuthConfig.class);
 
        Author author1 = ac.getBean(Author.class);
        System.out.println(author1);
 
        // Closing the application context!
        ((AnnotationConfigApplicationContext) ac).close();
    }
}
