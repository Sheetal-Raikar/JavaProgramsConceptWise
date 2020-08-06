package com.sharath.abstraction;

public abstract class Shape {

	public double area;
	public abstract void acceptInput();
	public abstract void compute();
	public void disp()
	{
		System.out.println(area);
	}
}
