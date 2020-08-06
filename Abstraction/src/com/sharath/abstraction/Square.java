package com.sharath.abstraction;

import java.util.Scanner;

public class Square extends Shape{
public int length;
	@Override
	public void acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter length for square");	
		length=s.nextInt();
	}

	@Override
	public void compute() {

		area=length*length;			
	}

}
