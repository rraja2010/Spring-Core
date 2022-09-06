package com.dependson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.dependson.bean.FirstBean;
import com.dependson.bean.SecondBean;
import com.dependson.bean.ThirdBean;

@Configuration
@ComponentScan("com.dependson")
public class AppConfig {
	
	@Bean("firstBean")
	@DependsOn(value = {
	        "secondBean",
	        "thirdBean"
	    })
	public FirstBean firstBean() {
		return new FirstBean();
	}

	@Bean("secondBean")
	public SecondBean secondBean() {
		return new SecondBean();
	}

	@Bean("thirdBean")
	public ThirdBean thirdBean() {
		return new ThirdBean();
	}

}
