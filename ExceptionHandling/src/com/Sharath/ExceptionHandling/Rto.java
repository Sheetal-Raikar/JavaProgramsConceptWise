package com.Sharath.ExceptionHandling;

import java.util.Scanner;

public class Rto {
public void InputData() throws Exception
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter age");
	int age=sc.nextInt();
	if (age<=17)
	{
		CustomException3 customException3 = new CustomException3();
		System.out.println(customException3.getMessage());
		throw customException3;
	}
	else if(age>65)
	{
		CustomException2 customException2 = new CustomException2();
		System.out.println(customException2.getMessage());
		throw customException2;
	}
	else
	{
		System.out.println("Collect your DL");
	}
}
}
