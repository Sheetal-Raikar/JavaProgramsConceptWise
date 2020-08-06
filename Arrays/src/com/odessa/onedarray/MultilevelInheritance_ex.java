package com.odessa.onedarray;

public class MultilevelInheritance_ex {

	public static void main(String[] args) {
Demo3 d3=new Demo3();
d3.disp1();
d3.disp2();
d3.disp3();
	}

}
class Demo1
{
	void disp1()
	{
		System.out.println("From Demo1");
	}
}
class Demo2 extends Demo1
{
	void disp2()
	{
		System.out.println("From Demo2");
	}
//	Demo2 will have disp1() and disp2()
}
class Demo3 extends Demo2
{
	void disp3()
	{
		System.out.println("From Demo3");
	}
//	Demo3 will have disp1() , disp2() and disp3()
}
