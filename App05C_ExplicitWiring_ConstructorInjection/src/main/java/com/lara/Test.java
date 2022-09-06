package com.lara;

public class Test {
	private String param1;
	private int param2;

	public Test(String arg1, int arg2) {
		System.out.println("String, int");
		param1 = arg1;
		param2 = arg2;
	}

	public Test(int arg1, String arg2) {
		System.out.println("int, String");
		param1 = arg2;
		param2 = arg1;
	}

	public String toString() {
		return "param1 : " + param1 + "," + "param2 : " + param2;
	}
}
