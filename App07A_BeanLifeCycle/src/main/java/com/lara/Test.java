package com.lara;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements DisposableBean, InitializingBean {
	private String param1;

	public Test() {
		System.out.println("Test()");
	}

	public String getParam1() {
		System.out.println("getParam1()");
		return param1;
	}

	public void setParam1(String param1) {
		System.out.println("setParma1()");
		this.param1 = param1;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("--from afterPropertiesSet()--");

	}

	public void destroy() throws Exception {
		System.out.println("----Destroy() method----");
	}

}
