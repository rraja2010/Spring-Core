package com.spring.primary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.primary.bean.Author;

@Configuration
public class AuthConfig {
	 @Bean
	    @Primary
	    public Author getAuthor1() {
	        System.out.println("getAuthor1() is called");
	 
	        Author author = new Author();       
	        author.setFullname("Rajesh Kumar");     
	        author.setDob("11 December 1982");
	        author.setCountry("India");
	 
	        return author;
	    }
	 
	    @Bean
	    public Author getAuthor2() {
	        System.out.println("getAuthor2() is called");
	 
	        Author author = new Author();       
	        author.setFullname("Kishore Singh");        
	        author.setDob("05 May 1991");
	        author.setCountry("India");
	 
	        return author;
	    }
}
