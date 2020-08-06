package com.sharath.abstraction;

public abstract class Plane {
	public int i=10;
	 public abstract void takeOff();
	 public abstract void fly();
	public void land()
	{
		System.out.println("plane is landing");
	}
}
