package com.odessa.onedarray;

public class stat_ex {

	public static void main(String[] args) {
		Demo.disp1();
		System.out.println("test");
			Demo d = new Demo();
			d.disp2();
			Demo.disp1();	
	}
}
class Demo
{
	static int a,b,c;
	int e,f,g;
	Demo()
	{
		a=10;
		b=20;
		c=30;
		e=40;
		f=50;
		g=60;
	}
//static method
	static void disp1()
	{
		System.out.println("inside static method");
		System.out.println(a);
	//	System.out.println(e);  non static variables cannot be accessed in static method
	}
//non-static method
	void disp2()
	{
		System.out.println("inside non-static method");
		System.out.println(a);  //static variables can be accessed in the non static method
		System.out.println(e);
	}
//static block:executed soon after the main() gets the control
//first thing to be executed in a program
	static
	{
		System.out.println("inside static block");
		System.out.println(a);
		//System.out.println(e);  non static variables cannot be accessed in static block
	}
//non-static block:executed soon after object creation and just before constructor execution	
	{
		System.out.println("inside non-static block");
		System.out.println(a);
		System.out.println(e);  //static variables can be accessed in the non static block
	}
}
