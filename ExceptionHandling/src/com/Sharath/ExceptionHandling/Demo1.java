package com.Sharath.ExceptionHandling;

//re-throwing an exception 
//when an already handled Exception object is propagated forcibly down the stack hierarchy
import java.util.Scanner;

public class Demo1 {
	public void alpha() throws Exception {
		System.out.println("connection2 is established");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter the numerator");
			int a = sc.nextInt();
			System.out.println("enter the denominator");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // even though the exception is caught here it is propagated to the main
												// method
			throw e; // the control goes to the main method i.e caller
// in the main method the catch block is executed			
		}
//	finally
//	{
//	System.out.println("connection2 is terminated");
//	}
	}
}
