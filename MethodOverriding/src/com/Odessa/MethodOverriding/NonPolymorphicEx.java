package com.Odessa.MethodOverriding;
//in this program polymorphism is not achieved as everytime the child object is called as there exists a 1:1 relationship.
//hence tight coupling exists
public class NonPolymorphicEx {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

		c1.cry();//1:1
		c2.cry();//1:1
	}
}

class Parent {
	public void cry() {
		System.out.println("parent wont cry");
	}
}

class Child1 extends Parent {
	public void cry() {
		System.out.println("child1 cries with less noise");
	}
}

class Child2 extends Parent {
	public void cry() {
		System.out.println("child2 cries with more noise");
	}
}
