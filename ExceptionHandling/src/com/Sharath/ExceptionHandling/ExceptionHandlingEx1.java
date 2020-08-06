package com.Sharath.ExceptionHandling;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		int number1=20;
		int number2=0;
			try
			{
				System.out.println("try block");
				if(number1/number2<0);
				System.out.println("after checking the condition");
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch block");
			}
			
			finally
			{
				System.out.println("finally block");
			}
	}

}
