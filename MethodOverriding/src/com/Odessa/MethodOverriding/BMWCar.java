package com.Odessa.MethodOverriding;

public class BMWCar extends Cars{
//	@Override
	public void intStartSpeed(int speed,int size)
	{
		//intStartSpeed(4); //calling method from parent class
		System.out.println("I'm from child class");
	}

}
