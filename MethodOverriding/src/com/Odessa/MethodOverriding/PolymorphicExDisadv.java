package com.Odessa.MethodOverriding;
//the disadvantage of the below program is specialized methods cannot be accessed directly using parent type reference
//p.eat() cannot be accessed using parent type reference
public class PolymorphicExDisadv {

	public static void main(String[] args) {
		Child1_2 c1=new Child1_2();
		Child2_2 c2 = new Child2_2();
		Parent_2 p; //parent type reference
		p=c1; //child type reference is assigned to parent type reference
		p.cry(); //child method is executed using parent type reference
	//	p.eat();//specialized methods cannot be accessed through parent reference
		
		p=c2;//child type reference is assigned to parent type reference
		p.cry();//child method is executed using parent type reference
	//	p.eat();//specialized methods cannot be accessed through parent reference
	}

}
class Parent_2 {
	public void cry() {
		System.out.println("parent wont cry");
	}
}

class Child1_2 extends Parent_2 {
	public void cry() {
		System.out.println("child1 cries with less noise");
	}
	public void eat()
	{
		System.out.println("child1 eats slowly");
	}
}

class Child2_2 extends Parent_2 {
	public void cry() {
		System.out.println("child2 cries with more noise");
	}
	public void eat()
	{
		System.out.println("child2 eats fast");
	}
}

