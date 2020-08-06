package com.Sharath.ExceptionHandling;

public class Bank {
public void initiate()
{
	Atm atm = new Atm();
	try
	{
		atm.inputData();
	}
	catch(Exception e)
	{
		try
		{
			atm.inputData();
		}
		catch(Exception f)
		{
			try
			{
				atm.inputData();
			}
			catch(Exception g)
			{
				System.exit(0);
			}
		}
	}
}
}
