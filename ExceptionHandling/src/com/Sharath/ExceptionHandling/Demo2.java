package com.Sharath.ExceptionHandling;

import java.util.Scanner;

public class Demo2 {

public void alpha() 
{
	System.out.println("connection2 is established");
	Scanner sc = new Scanner(System.in);
	
	
		System.out.println("enter the numerator");
	int a=sc.nextInt();
	System.out.println("enter the denominator");
	int b=sc.nextInt();
	int c=a/b;
	System.out.println(c);
	

}
}
