package com.Sharath.ExceptionHandling;

public class ExceptionHandlingEx6 {

	public static void main(String[] args) {
System.out.println("connection1 is established");
try
{
Demo1 d=new Demo1();
d.alpha();
}
catch(Exception e)
{
	System.out.println("exception handled in main");
}
System.out.println("connection1 is terminated");
	}

}
