package com.Odessa.MethodOverriding;
//in this program polymorphism is achieved by creating a parent object and assigning a child object to it.
//	1:M relationship exists here...loose coupling is seen
//p.cry() when called in the program produces diff output everytime it is called..hence polymorphism is achieved
public class PolymorphicEx {

	public static void main(String[] args) {
	
		Child1_1 c1 = new Child1_1();
		Child2_1 c2 = new Child2_1();
		Parent_1 p;//parent type reference
		p=c1;//child type reference is assigned to parent type reference
		p.cry();//1:M   //child method is executed using parent type reference
		p=c2;//child type reference is assigned to parent type reference
		p.cry();//1:M   //child method is executed using parent type reference
	
		
	}

}

class Parent_1 {
	public void cry() {
		System.out.println("parent wont cry");
	}
}

class Child1_1 extends Parent_1 {
	public void cry() {
		System.out.println("child1 cries with less noise");
	}
}

class Child2_1 extends Parent_1 {
	public void cry() {
		System.out.println("child2 cries with more noise");
	}
}
