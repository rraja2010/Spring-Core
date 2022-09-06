package com.lara;

public class Manager00 {
	public static void main(String[] args) {
		Test t1 = (Test) Util.getObject("t1");
		System.out.println(t1.getParam1());
		System.out.println(t1.getParam2());
		System.out.println("done");
	}
}
