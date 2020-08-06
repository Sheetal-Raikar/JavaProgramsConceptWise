package com.Sharath.Interface;
//Multiple Interface 
public class Calculator3 implements MyCalculator,MyCalculator2{

	@Override
	public void add() {
		int a=20;
		int b=10;
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		int a=20;
		int b=10;
		System.out.println(a-b);
	}

	@Override
	public void mul() {
		int a=20;
		int b=10;
		System.out.println(a*b);
	}

	@Override
	public void div() {
		int a=20;
		int b=10;
		System.out.println(a/b);
	}

}
