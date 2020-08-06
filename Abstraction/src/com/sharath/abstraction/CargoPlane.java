package com.sharath.abstraction;

public class CargoPlane extends Plane{

	@Override
	public void takeOff() {
		System.out.println("Cargo plane is taking Off");
		System.out.println(i);
	}

	@Override
	public void fly() {
		System.out.println("Cargo plane if flying");
	}

}
