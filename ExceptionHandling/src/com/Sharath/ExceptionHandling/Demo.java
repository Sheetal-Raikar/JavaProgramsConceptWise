package com.Sharath.ExceptionHandling;

import java.util.Scanner;

public class Demo {
public void alpha()
{
//	try {
	System.out.println("Connection2 is established");
Scanner sc = new Scanner(System.in);
System.out.println("enter the numerator");
int a=sc.nextInt();
System.out.println("enter the denominator");
int b=sc.nextInt();
int c=a/b;
System.out.println(c);

//}
//	catch(ArithmeticException e )
//	{
//		System.out.println("enter proper denominator");
//	}
System.out.println("Connection2 is terminated");
}
}
