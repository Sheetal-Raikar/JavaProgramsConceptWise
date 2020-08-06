package com.Sharath.ExceptionHandling;

public class RunTimeExeptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a=20;
//int b=0;
//try {
//int c=a/b;
//System.out.println(c);
//	}
//catch(ArithmeticException e){
//	System.out.println(e.getMessage());
//	System.out.println("divide by zero is not possible");
//}
int[] newArray = {1,2,3};
try {
	System.out.println(newArray[4]);
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}	
}
