package com.Sharath.ExceptionHandling;

public class ExceptionHandlingEx9 {

	public static void main(String[] args) throws Exception {
Rto rto = new Rto();
try
{
rto.InputData();
}
catch(Exception e)
{
	try
	{
		rto.InputData();
	}
		catch(Exception f)
		{
			try
			{
				rto.InputData();
			}
				catch(Exception g)
				{
					System.exit(0);
				}
			}
		}
	}

}
