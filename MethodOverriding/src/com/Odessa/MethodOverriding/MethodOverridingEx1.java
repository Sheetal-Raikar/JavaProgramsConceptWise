package com.Odessa.MethodOverriding;

public class MethodOverridingEx1 {

	public static void main(String[] args) {
		PassengerPlane p1 = new PassengerPlane();
		FighterPlane f1 = new FighterPlane();
		CargoPlane c1 = new CargoPlane();
		p1.takeOff();
		p1.fly();
		p1.land();
		p1.carryPassenger();
		
		f1.takeOff();
		f1.fly();
		f1.land();
		f1.carryWeapon();
		
		c1.takeOff();
		c1.fly();
		c1.land();
		c1.carryCargo();

	}

}
