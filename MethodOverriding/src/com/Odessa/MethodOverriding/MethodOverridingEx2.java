package com.Odessa.MethodOverriding;

public class MethodOverridingEx2 {

	public static void main(String[] args) {
Deer d= new Deer();
Tiger t = new Tiger();
Monkey m = new Monkey();

d.eat();
d.sleep();
d.foodHabit();

t.eat();
t.sleep();
t.foodHabit();

m.eat();
m.sleep();
m.foodHabit();

	}

}
