package com.lara;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Person getPersonDetails() {
		Person person = new Person();
		person.setFirstName("Amit");
		person.setLastName("kumar");
		person.setAge(30);
		return person;
	}
}
