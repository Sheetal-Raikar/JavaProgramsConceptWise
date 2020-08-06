package com.sharath.abstraction;

public class Airport {
	public void permit(Plane pref)
	{
		pref.takeOff();
		pref.fly();
		pref.land();
	}

}
