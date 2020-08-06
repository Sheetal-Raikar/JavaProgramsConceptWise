package com.sharath.abstraction;

import java.util.Scanner;

public class Circle extends Shape{
public int radius;
	@Override
	public void acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter radius for circle");
		radius=s.nextInt();
	}

	@Override
	public void compute() {
		area=3.14*radius*radius;
	}

}
