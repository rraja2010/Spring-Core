package com.com;

public class Manager {
	Ainterface ai;

	public void set(Ainterface a) {
		this.ai = a;
	}

	public void testit() {
		ai.test();
	}

	public static void main(String[] args) {
		Manager m = new Manager();

		Bimp b = new Bimp();
		m.set(b);
		m.testit();
		System.out.println("---------------");

		Cimp c = new Cimp();
		m.set(c);
		m.testit();
		System.out.println("----------------");

		Dimp d = new Dimp();
		m.set(d);
		m.testit();
		System.out.println("-----------------");

		Eimp e = new Eimp();
		m.set(e);
		m.testit();

		System.out.println("--------End of life-------");

	}
}
