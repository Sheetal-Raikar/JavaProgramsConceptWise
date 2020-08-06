package com.Sharath.Interface;
/***
 * 
 * @author Sheetal.Raikar
 *
 */
public class Calculator1 implements MyCalculator{
public int number1;
public int number2;
public int result;
	@Override
	public void mul() {
		number1=10;
		number2=20;
		result=number1*number2;
		System.out.println(result);
	}

	@Override
	public void div() {
		number1=40;
		number2=2;
		result=number1/number2;
		System.out.println(result);
	}

}
