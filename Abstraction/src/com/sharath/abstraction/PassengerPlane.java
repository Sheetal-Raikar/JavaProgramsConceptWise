package com.sharath.abstraction;

public class PassengerPlane extends Plane{

	@Override
	public void takeOff() {
		System.out.println("Passenger plane is taking Off");
		System.out.println(i);
	}

	@Override
	public void fly() {
		System.out.println("Passenger plane if flying");
	}

}
