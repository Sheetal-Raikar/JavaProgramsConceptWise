package com.odessa.onedarray;

public class BMW extends Cars{
	int speed;
public BMW(int startSpeed)
{
	super(startSpeed);
	System.out.println("inside child's param constructor");
//	speed=startSpeed;
}
//@Override
public void increasingSpeed()
{
	speed++;
	System.out.println("Increased speed of BMW is"+speed+" "+super.speed);
}
public void decreasingSpeed()
{
	speed--;
	System.out.println("Decreased speed od BMW is"+speed);
}
}
