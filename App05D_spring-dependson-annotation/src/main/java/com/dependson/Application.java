package com.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependson.bean.FirstBean;
import com.dependson.config.AppConfig;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean bean = context.getBean(FirstBean.class);
		bean.populateBeans();
		context.close();
	}
}

/*
output
SecondBean Initialized via Constuctor
ThirdBean Initialized via Constuctor
FirstBean Initialized via Constuctor
SecondBean method called
ThirdBean method called

As we can see in the above output, the beans SecondBean and ThirdBean are initialized before bean FirstBean.

*/