package com.Sharath.ExceptionHandling;
//Ducking an Exception
//Exception is not handled in the called method i.e alpha but handled in the caller method i.e main
public class ExceptionHandlingEx7 {
public static void main(String[] args)
{
	try {
	Demo2 d2=new Demo2();
	d2.alpha();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println("handled in main");
	}
}
}
