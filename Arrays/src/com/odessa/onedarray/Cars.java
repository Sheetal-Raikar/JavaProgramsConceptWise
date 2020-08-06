package com.odessa.onedarray;

public class Cars {
	int speed;
	public Cars()
	{
		this(100);
		System.out.println("inside parent's zero param constructor");
		
	}
	public Cars(int startSpeed)
	{
		System.out.println("inside parent's param constructor");
		speed=startSpeed;
	}
	public void increasingSpeed()
	{
		speed++;
		System.out.println("Increased speed of cars is"+speed);
	}
	public void decreasingSpeed()
	{
		speed--;
		System.out.println("Decreased speed od cars is"+speed);
	}

}
