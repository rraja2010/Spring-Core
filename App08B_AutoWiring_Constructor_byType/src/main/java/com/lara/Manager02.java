package com.lara;

public class Manager02 {
	public static void main(String[] args) {
		Student st = (Student) Util.getBean("s2");
		System.out.println(st);
	}
}
