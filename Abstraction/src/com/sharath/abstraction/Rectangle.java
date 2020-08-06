package com.sharath.abstraction;

import java.util.Scanner;

public class Rectangle extends Shape{
public int length;
public int breadth;
	@Override
	public void acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter length for rectangle");
		length=s.nextInt();
		System.out.println("enter breadth for rectangle");
		breadth=s.nextInt();
		
	}

	@Override
	public void compute() {
		area=length*breadth;
	}

}
