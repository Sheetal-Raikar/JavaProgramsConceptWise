package com.Odessa.MethodOverriding;

public class MethodOverridingEx1_simplified_flexible_reducedcode {

	public static void main(String[] args) {
		PassengerPlane p1 = new PassengerPlane();
		FighterPlane f1 = new FighterPlane();
		CargoPlane c1 = new CargoPlane();
		Airport a = new Airport();
a.permit(p1);
a.permit(f1);
a.permit(c1);
	}

}

  class Airport {
	public void permit(Plane pref) {
		pref.takeOff();
		pref.fly();
		pref.land();
	}
}
