package com.Sharath.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingEx4 {

	public static void main(String[] args) {
		System.out.println("connection is established");
		try {
Scanner sc = new Scanner(System.in);
System.out.println("enter the numerator");
int a=sc.nextInt();
System.out.println("enter the denominator");
int b=sc.nextInt();
int c=a/b;
System.out.println(c);
System.out.println("enter the size of an array");
int arrsize=sc.nextInt();
int[] arr=new int[arrsize];
System.out.println("enter the element to be stored");
int s=sc.nextInt();
System.out.println("enter the position at which the element must be stored");
int pos=sc.nextInt();
arr[pos]=s;
System.out.println(arr[pos]);

		}
		catch(ArithmeticException a)
		{
			System.out.println("provide proper denominator");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("provide proper array index");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("provide positive size");
		}
		catch(Exception e)
		{
			System.out.println("some problem occured");
		}
	}

}
