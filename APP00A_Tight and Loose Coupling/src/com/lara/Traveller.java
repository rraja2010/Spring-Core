package com.lara;

public class Traveller {

	Vehical v;

	public void setV(Vehical v) {
		this.v = v;
	}

	void startJourney() {
		v.move();
	}
}
