package com.Sharath.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingEx3 {

	public static void main(String[] args) {
System.out.println("connection is established");
Scanner sc = new Scanner(System.in);
try {
System.out.println("enter the numerator");
int a=sc.nextInt();
System.out.println("enter the denominator");
int b=sc.nextInt();
int c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
	System.out.println("enter the right denominator");
}
System.out.println("connection terminated");
	}

}
