package com.Sharath.Interface;

public class InterfaceEx1 {

	public static void main(String[] args) {
Calculator1 c1 = new Calculator1();
//MyCalculator m=new Calculator2(); this is also possible
Calculator2 c2 = new Calculator2();
Calculate c=new Calculate();
c.inputObject(c1);
c.inputObject(c2);
c2.disp();
	}

}
