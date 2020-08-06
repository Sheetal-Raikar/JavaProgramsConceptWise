package com.Odessa.Examples;

public class ExceptionError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int i=10/0;
}
catch(Exception e)
{
e.printStackTrace();
}
catch(ArithmeticException e)
{
	e.printStackTrace();
}

	}

}
