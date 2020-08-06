package com.Odessa.MethodOverriding;
//child class's specialized methods cannot be directly accessed by parent type reference.
//so temporarily parent type reference is converted to child type reference to access such specialized methods
//this is called downcasting
public class PolymorphicExDisadv_OverCome {

	public static void main(String[] args) {
/*		int i=1000;
		byte b=(byte)i;
		System.out.println(b)*/
Child1_3 c1 = new Child1_3();
Child2_3 c2 = new Child2_3();
Parent_3 p;
p=c1;
p.cry();
//p.eat(); error ...as parent type reference cannot access specialized method of a child directly
//in the below line downcasting is done i.e converting parent type reference to child type reference
((Child1_3)(p)).eat();

p=c2;
p.cry();
//p.eat(); error
((Child2_3)(p)).eat();
	}

}

class Parent_3 {
	public void cry() {
		System.out.println("parent wont cry");
	}
}

class Child1_3 extends Parent_3 {
	public void cry() {
		System.out.println("child1 cries with less noise");
	}

	public void eat() {
		System.out.println("child1 eats slowly");
	}
}

class Child2_3 extends Parent_3 {
	public void cry() {
		System.out.println("child2 cries with more noise");
	}

	public void eat() {
		System.out.println("child2 eats fast");
	}
}
