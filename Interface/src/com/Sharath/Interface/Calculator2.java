package com.Sharath.Interface;

import java.util.Scanner;

public class Calculator2 implements MyCalculator{

	@Override
	public void mul() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number 1");
		int number1=scan.nextInt();
		System.out.println("enter number 2");
		int number2=scan.nextInt();
		System.out.println(number1*number2);
		
	}

	@Override
	public void div() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number 1");
		int number1=scan.nextInt();
		System.out.println("enter number 2");
		int number2=scan.nextInt();
		System.out.println(number1/number2);
	}
	public void disp()
	{
		System.out.println("hello");
	}

}
