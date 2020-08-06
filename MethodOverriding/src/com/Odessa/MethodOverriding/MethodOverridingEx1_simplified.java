package com.Odessa.MethodOverriding;
//downcasting is done here
public class MethodOverridingEx1_simplified {

	public static void main(String[] args) {
		PassengerPlane p1 = new PassengerPlane();
		FighterPlane f1 = new FighterPlane();
		CargoPlane c1 = new CargoPlane();
		Plane pref;
		pref = p1;
		pref.takeOff();
		pref.fly();
		pref.land();
		((PassengerPlane) (pref)).carryPassenger();

		pref = f1;
		pref.takeOff();
		pref.fly();
		pref.land();
		((FighterPlane) (pref)).carryWeapon();

		pref = c1;
		pref.takeOff();
		pref.fly();
		pref.land();
		((CargoPlane)(pref)).carryCargo();

	}

}
