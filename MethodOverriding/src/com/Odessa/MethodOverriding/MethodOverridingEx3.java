package com.Odessa.MethodOverriding;

public class MethodOverridingEx3 {
	public static void main(String[] args) {

		Cars c = new BMWCar();  //Dynamic method dispatch
		c.intStartSpeed(2);  //the overridden method from the child class is executed..not the method from parent class
		c.intMileage(); //specific methods from parent class if exists can also be executed..
						//which are not overridden by the child class
	}
}


